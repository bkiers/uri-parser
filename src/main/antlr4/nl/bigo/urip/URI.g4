// The MIT License (MIT)
//
// Copyright (C) 2024 bkiers, https://github.com/bkiers
//
// Permission is hereby granted, free of charge, to any person obtaining a copy of
// this software and associated documentation files (the "Software"), to deal in
// the Software without restriction, including without limitation the rights to
// use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
// the Software, and to permit persons to whom the Software is furnished to do so,
// subject to the following conditions:
//
// The above copyright notice and this permission notice shall be included in all
// copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
// FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
// COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
// IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
// CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
//
// Project      : An ANTLR 4 grammar for URI's.
// Developed by : Bart Kiers, bart@big-o.nl
grammar URI;

parse
 : ( uri_reference | absolute_uri ) EOF
 ;

/// URI-reference = URI / relative-ref
uri_reference
 : uri
 | relative_ref
 ;

/// absolute-URI  = scheme ":" hier-part [ "?" query ]
absolute_uri
 : scheme ':' hier_part ( '?' query )?
 ;

/// URI           = scheme ":" hier-part [ "?" query ] [ "#" fragment ]
uri
 : scheme ':' hier_part ( '?' query )? ( '#' fragment_ )?
 ;

/// hier-part     = "//" authority path-abempty
///               / path-absolute
///               / path-rootless
///               / path-empty
hier_part
 : '/' '/' authority path_abempty
 | path_absolute
 | path_rootless
 | path_empty
 ;

/// relative-ref  = relative-part [ "?" query ] [ "#" fragment ]
relative_ref
 : relative_part ( '?' query )? ( '#' fragment_ )?
 ;

/// relative-part = "//" authority path-abempty
///               / path-absolute
///               / path-noscheme
///               / path-empty
relative_part
 : '/' '/' authority path_abempty
 | path_absolute
 | path_noscheme
 | path_empty
 ;

/// scheme        = ALPHA *( ALPHA / DIGIT / "+" / "-" / "." )
scheme
 : alpha ( alpha | digit | '+' | '-' | '.' )*
 ;

/// authority     = [ userinfo "@" ] host [ ":" port ]
authority
 : ( userinfo '@' )? host ( ':' port )?
 ;

/// userinfo      = *( unreserved / pct-encoded / sub-delims / ":" )
userinfo
 : ( unreserved | pct_encoded | sub_delims | ':' )*
 ;

/// host          = IP-literal / IPv4address / reg-name
host
 : ip_literal
 | ipv4address
 | reg_name
 ;

/// port          = *DIGIT
port
 : digit*
 ;

/// IP-literal    = "[" ( IPv6address / IPvFuture  ) "]"
ip_literal
 : '[' ( ipv6address | ipvfuture  ) ']'
 ;

/// IPvFuture     = "v" 1*HEXDIG "." 1*( unreserved / sub-delims / ":" )
ipvfuture
 : 'v' hexdigit+ '.' ( unreserved | sub_delims | ':' )+
 ;

/// IPv6address   =                            6( h16 ":" ) ls32
///               /                       "::" 5( h16 ":" ) ls32
///               / [               h16 ] "::" 4( h16 ":" ) ls32
///               / [ *1( h16 ":" ) h16 ] "::" 3( h16 ":" ) ls32
///               / [ *2( h16 ":" ) h16 ] "::" 2( h16 ":" ) ls32
///               / [ *3( h16 ":" ) h16 ] "::"    h16 ":"   ls32
///               / [ *4( h16 ":" ) h16 ] "::"              ls32
///               / [ *5( h16 ":" ) h16 ] "::"              h16
///               / [ *6( h16 ":" ) h16 ] "::"
ipv6address
 :                                                                                                h16 ':' h16 ':' h16 ':' h16 ':' h16 ':' h16 ':' ls32
 |                                                                                        ':' ':' h16 ':' h16 ':' h16 ':' h16 ':' h16 ':'         ls32
 | ( h16 )?                                                                               ':' ':' h16 ':' h16 ':' h16 ':' h16 ':'                 ls32
 | ( ( h16 ':' )? h16 )?                                                                  ':' ':' h16 ':' h16 ':' h16 ':'                         ls32
 | ( ( ( h16 ':' )? h16 ':' )? h16 )?                                                     ':' ':' h16 ':' h16 ':'                                 ls32
 | ( ( ( ( h16 ':' )? h16 ':' )? h16 ':' )? h16 )?                                        ':' ':' h16 ':'                                         ls32
 | ( ( ( ( ( h16 ':' )? h16 ':' )? h16 ':' )? h16 ':' )? h16 )?                           ':' ':'                                                 ls32
 | ( ( ( ( ( ( h16 ':' )? h16 ':' )? h16 ':' )? h16 ':' )? h16 ':' )? h16 )?              ':' ':'                                                 h16
 | ( ( ( ( ( ( ( h16 ':' )? h16 ':' )? h16 ':' )? h16 ':' )? h16 ':' )? h16 ':' )? h16 )? ':' ':'
 ;

/// h16           = 1*4HEXDIG
h16
 : ( ( hexdigit? hexdigit )? hexdigit )? hexdigit
 ;

/// ls32          = ( h16 ":" h16 ) / IPv4address
ls32
 : h16 ':' h16
 | ipv4address
 ;

/// IPv4address   = dec-octet "." dec-octet "." dec-octet "." dec-octet
ipv4address
 : dec_octet '.' dec_octet '.' dec_octet '.' dec_octet
 ;

/// dec-octet     = DIGIT                 ; 0-9
///               / %x31-39 DIGIT         ; 10-99
///               / "1" 2DIGIT            ; 100-199
///               / "2" %x30-34 DIGIT     ; 200-249
///               / "25" %x30-35          ; 250-255
dec_octet
 : D1 digit digit                                       // 100-199
 | D2 ( D0 | D1 | D2 | D3 | D4 ) digit                  // 200-249
 | D2 D5 ( D0 | D1 | D2 | D3 | D4 | D5 )                // 250-255
 | ( D1 | D2 | D3 | D4 | D5 | D6 | D7 | D8 | D9 ) digit // 10-99
 | digit                                                // 0-9
 ;

/// reg-name      = *( unreserved / pct-encoded / sub-delims )
reg_name
 : ( unreserved | pct_encoded | sub_delims )*
 ;

/// path-abempty  = *( "/" segment )
path_abempty
 : ( '/' segment )*
 ;

/// path-absolute = "/" [ segment-nz *( "/" segment ) ]
path_absolute
 : '/' ( segment_nz )?
 ;

/// path-noscheme = segment-nz-nc *( "/" segment )
path_noscheme
 : segment_nz_nc ( '/' segment )*
 ;

/// path-rootless = segment-nz *( "/" segment )
path_rootless
 : segment_nz ( '/' segment )*
 ;

/// path-empty    = 0<pchar>
path_empty
 : /* 0<pchar> */
 ;

/// segment       = *pchar
segment
 : pchar*
 ;

/// segment-nz    = 1*pchar
segment_nz
 : pchar+
 ;

/// segment-nz-nc = 1*( unreserved / pct-encoded / sub-delims / "@" )
///               ; non-zero-length segment without any colon ":"
segment_nz_nc
 : ( unreserved | pct_encoded | sub_delims | '@' )+
 ;

/// pchar         = unreserved / pct-encoded / sub-delims / ":" / "@"
pchar
 : unreserved
 | pct_encoded
 | sub_delims
 | ':'
 | '@'
 ;

/// query         = *( pchar / "/" / "?" )
query
 : ( pchar | '/' | '?' )*
 ;

/// fragment      = *( pchar / "/" / "?" )
fragment_
 : ( pchar | '/' | '?' )*
 ;

/// pct-encoded   = "%" HEXDIG HEXDIG
pct_encoded
 : '%' hexdigit hexdigit
 ;

/// unreserved    = ALPHA / DIGIT / "-" / "." / "_" / "~"
unreserved
 : alpha
 | digit
 | '-'
 | '.'
 | '_'
 | '~'
 ;

/// sub-delims    = "!" / "$" / "&" / "'" / "(" / ")"
///               / "*" / "+" / "," / ";" / "="
sub_delims
 : '!'
 | '$'
 | '&'
 | '\''
 | '('
 | ')'
 | '*'
 | '+'
 | ','
 | ';'
 | '='
 ;

alpha
 : A_F
 | G_Z
 | VL
 ;

digit
 : D1
 | D2
 | D3
 | D4
 | D5
 | D6
 | D7
 | D8
 | D9
 | D0
 ;

hexdigit
 : digit
 | A_F
 ;

VL : 'v';
A_F : [a-fA-F];
G_Z : [g-uw-zG-Z];

D1 : '1';
D2 : '2';
D3 : '3';
D4 : '4';
D5 : '5';
D6 : '6';
D7 : '7';
D8 : '8';
D9 : '9';
D0 : '0';

OTHER : .;