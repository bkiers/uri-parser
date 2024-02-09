// Generated from nl/bigo/urip/URI.g4 by ANTLR 4.13.1
package nl.bigo.urip;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link URIParser}.
 */
public interface URIListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link URIParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(URIParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link URIParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(URIParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link URIParser#uri_reference}.
	 * @param ctx the parse tree
	 */
	void enterUri_reference(URIParser.Uri_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link URIParser#uri_reference}.
	 * @param ctx the parse tree
	 */
	void exitUri_reference(URIParser.Uri_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link URIParser#absolute_uri}.
	 * @param ctx the parse tree
	 */
	void enterAbsolute_uri(URIParser.Absolute_uriContext ctx);
	/**
	 * Exit a parse tree produced by {@link URIParser#absolute_uri}.
	 * @param ctx the parse tree
	 */
	void exitAbsolute_uri(URIParser.Absolute_uriContext ctx);
	/**
	 * Enter a parse tree produced by {@link URIParser#uri}.
	 * @param ctx the parse tree
	 */
	void enterUri(URIParser.UriContext ctx);
	/**
	 * Exit a parse tree produced by {@link URIParser#uri}.
	 * @param ctx the parse tree
	 */
	void exitUri(URIParser.UriContext ctx);
	/**
	 * Enter a parse tree produced by {@link URIParser#hier_part}.
	 * @param ctx the parse tree
	 */
	void enterHier_part(URIParser.Hier_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link URIParser#hier_part}.
	 * @param ctx the parse tree
	 */
	void exitHier_part(URIParser.Hier_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link URIParser#relative_ref}.
	 * @param ctx the parse tree
	 */
	void enterRelative_ref(URIParser.Relative_refContext ctx);
	/**
	 * Exit a parse tree produced by {@link URIParser#relative_ref}.
	 * @param ctx the parse tree
	 */
	void exitRelative_ref(URIParser.Relative_refContext ctx);
	/**
	 * Enter a parse tree produced by {@link URIParser#relative_part}.
	 * @param ctx the parse tree
	 */
	void enterRelative_part(URIParser.Relative_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link URIParser#relative_part}.
	 * @param ctx the parse tree
	 */
	void exitRelative_part(URIParser.Relative_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link URIParser#scheme}.
	 * @param ctx the parse tree
	 */
	void enterScheme(URIParser.SchemeContext ctx);
	/**
	 * Exit a parse tree produced by {@link URIParser#scheme}.
	 * @param ctx the parse tree
	 */
	void exitScheme(URIParser.SchemeContext ctx);
	/**
	 * Enter a parse tree produced by {@link URIParser#authority}.
	 * @param ctx the parse tree
	 */
	void enterAuthority(URIParser.AuthorityContext ctx);
	/**
	 * Exit a parse tree produced by {@link URIParser#authority}.
	 * @param ctx the parse tree
	 */
	void exitAuthority(URIParser.AuthorityContext ctx);
	/**
	 * Enter a parse tree produced by {@link URIParser#userinfo}.
	 * @param ctx the parse tree
	 */
	void enterUserinfo(URIParser.UserinfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link URIParser#userinfo}.
	 * @param ctx the parse tree
	 */
	void exitUserinfo(URIParser.UserinfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link URIParser#host}.
	 * @param ctx the parse tree
	 */
	void enterHost(URIParser.HostContext ctx);
	/**
	 * Exit a parse tree produced by {@link URIParser#host}.
	 * @param ctx the parse tree
	 */
	void exitHost(URIParser.HostContext ctx);
	/**
	 * Enter a parse tree produced by {@link URIParser#port}.
	 * @param ctx the parse tree
	 */
	void enterPort(URIParser.PortContext ctx);
	/**
	 * Exit a parse tree produced by {@link URIParser#port}.
	 * @param ctx the parse tree
	 */
	void exitPort(URIParser.PortContext ctx);
	/**
	 * Enter a parse tree produced by {@link URIParser#ip_literal}.
	 * @param ctx the parse tree
	 */
	void enterIp_literal(URIParser.Ip_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link URIParser#ip_literal}.
	 * @param ctx the parse tree
	 */
	void exitIp_literal(URIParser.Ip_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link URIParser#ipvfuture}.
	 * @param ctx the parse tree
	 */
	void enterIpvfuture(URIParser.IpvfutureContext ctx);
	/**
	 * Exit a parse tree produced by {@link URIParser#ipvfuture}.
	 * @param ctx the parse tree
	 */
	void exitIpvfuture(URIParser.IpvfutureContext ctx);
	/**
	 * Enter a parse tree produced by {@link URIParser#ipv6address}.
	 * @param ctx the parse tree
	 */
	void enterIpv6address(URIParser.Ipv6addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link URIParser#ipv6address}.
	 * @param ctx the parse tree
	 */
	void exitIpv6address(URIParser.Ipv6addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link URIParser#h16}.
	 * @param ctx the parse tree
	 */
	void enterH16(URIParser.H16Context ctx);
	/**
	 * Exit a parse tree produced by {@link URIParser#h16}.
	 * @param ctx the parse tree
	 */
	void exitH16(URIParser.H16Context ctx);
	/**
	 * Enter a parse tree produced by {@link URIParser#ls32}.
	 * @param ctx the parse tree
	 */
	void enterLs32(URIParser.Ls32Context ctx);
	/**
	 * Exit a parse tree produced by {@link URIParser#ls32}.
	 * @param ctx the parse tree
	 */
	void exitLs32(URIParser.Ls32Context ctx);
	/**
	 * Enter a parse tree produced by {@link URIParser#ipv4address}.
	 * @param ctx the parse tree
	 */
	void enterIpv4address(URIParser.Ipv4addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link URIParser#ipv4address}.
	 * @param ctx the parse tree
	 */
	void exitIpv4address(URIParser.Ipv4addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link URIParser#dec_octet}.
	 * @param ctx the parse tree
	 */
	void enterDec_octet(URIParser.Dec_octetContext ctx);
	/**
	 * Exit a parse tree produced by {@link URIParser#dec_octet}.
	 * @param ctx the parse tree
	 */
	void exitDec_octet(URIParser.Dec_octetContext ctx);
	/**
	 * Enter a parse tree produced by {@link URIParser#reg_name}.
	 * @param ctx the parse tree
	 */
	void enterReg_name(URIParser.Reg_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link URIParser#reg_name}.
	 * @param ctx the parse tree
	 */
	void exitReg_name(URIParser.Reg_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link URIParser#path_abempty}.
	 * @param ctx the parse tree
	 */
	void enterPath_abempty(URIParser.Path_abemptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link URIParser#path_abempty}.
	 * @param ctx the parse tree
	 */
	void exitPath_abempty(URIParser.Path_abemptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link URIParser#path_absolute}.
	 * @param ctx the parse tree
	 */
	void enterPath_absolute(URIParser.Path_absoluteContext ctx);
	/**
	 * Exit a parse tree produced by {@link URIParser#path_absolute}.
	 * @param ctx the parse tree
	 */
	void exitPath_absolute(URIParser.Path_absoluteContext ctx);
	/**
	 * Enter a parse tree produced by {@link URIParser#path_noscheme}.
	 * @param ctx the parse tree
	 */
	void enterPath_noscheme(URIParser.Path_noschemeContext ctx);
	/**
	 * Exit a parse tree produced by {@link URIParser#path_noscheme}.
	 * @param ctx the parse tree
	 */
	void exitPath_noscheme(URIParser.Path_noschemeContext ctx);
	/**
	 * Enter a parse tree produced by {@link URIParser#path_rootless}.
	 * @param ctx the parse tree
	 */
	void enterPath_rootless(URIParser.Path_rootlessContext ctx);
	/**
	 * Exit a parse tree produced by {@link URIParser#path_rootless}.
	 * @param ctx the parse tree
	 */
	void exitPath_rootless(URIParser.Path_rootlessContext ctx);
	/**
	 * Enter a parse tree produced by {@link URIParser#path_empty}.
	 * @param ctx the parse tree
	 */
	void enterPath_empty(URIParser.Path_emptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link URIParser#path_empty}.
	 * @param ctx the parse tree
	 */
	void exitPath_empty(URIParser.Path_emptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link URIParser#segment}.
	 * @param ctx the parse tree
	 */
	void enterSegment(URIParser.SegmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link URIParser#segment}.
	 * @param ctx the parse tree
	 */
	void exitSegment(URIParser.SegmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link URIParser#segment_nz}.
	 * @param ctx the parse tree
	 */
	void enterSegment_nz(URIParser.Segment_nzContext ctx);
	/**
	 * Exit a parse tree produced by {@link URIParser#segment_nz}.
	 * @param ctx the parse tree
	 */
	void exitSegment_nz(URIParser.Segment_nzContext ctx);
	/**
	 * Enter a parse tree produced by {@link URIParser#segment_nz_nc}.
	 * @param ctx the parse tree
	 */
	void enterSegment_nz_nc(URIParser.Segment_nz_ncContext ctx);
	/**
	 * Exit a parse tree produced by {@link URIParser#segment_nz_nc}.
	 * @param ctx the parse tree
	 */
	void exitSegment_nz_nc(URIParser.Segment_nz_ncContext ctx);
	/**
	 * Enter a parse tree produced by {@link URIParser#pchar}.
	 * @param ctx the parse tree
	 */
	void enterPchar(URIParser.PcharContext ctx);
	/**
	 * Exit a parse tree produced by {@link URIParser#pchar}.
	 * @param ctx the parse tree
	 */
	void exitPchar(URIParser.PcharContext ctx);
	/**
	 * Enter a parse tree produced by {@link URIParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(URIParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link URIParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(URIParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link URIParser#fragment_}.
	 * @param ctx the parse tree
	 */
	void enterFragment_(URIParser.Fragment_Context ctx);
	/**
	 * Exit a parse tree produced by {@link URIParser#fragment_}.
	 * @param ctx the parse tree
	 */
	void exitFragment_(URIParser.Fragment_Context ctx);
	/**
	 * Enter a parse tree produced by {@link URIParser#pct_encoded}.
	 * @param ctx the parse tree
	 */
	void enterPct_encoded(URIParser.Pct_encodedContext ctx);
	/**
	 * Exit a parse tree produced by {@link URIParser#pct_encoded}.
	 * @param ctx the parse tree
	 */
	void exitPct_encoded(URIParser.Pct_encodedContext ctx);
	/**
	 * Enter a parse tree produced by {@link URIParser#unreserved}.
	 * @param ctx the parse tree
	 */
	void enterUnreserved(URIParser.UnreservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link URIParser#unreserved}.
	 * @param ctx the parse tree
	 */
	void exitUnreserved(URIParser.UnreservedContext ctx);
	/**
	 * Enter a parse tree produced by {@link URIParser#sub_delims}.
	 * @param ctx the parse tree
	 */
	void enterSub_delims(URIParser.Sub_delimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link URIParser#sub_delims}.
	 * @param ctx the parse tree
	 */
	void exitSub_delims(URIParser.Sub_delimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link URIParser#alpha}.
	 * @param ctx the parse tree
	 */
	void enterAlpha(URIParser.AlphaContext ctx);
	/**
	 * Exit a parse tree produced by {@link URIParser#alpha}.
	 * @param ctx the parse tree
	 */
	void exitAlpha(URIParser.AlphaContext ctx);
	/**
	 * Enter a parse tree produced by {@link URIParser#digit}.
	 * @param ctx the parse tree
	 */
	void enterDigit(URIParser.DigitContext ctx);
	/**
	 * Exit a parse tree produced by {@link URIParser#digit}.
	 * @param ctx the parse tree
	 */
	void exitDigit(URIParser.DigitContext ctx);
	/**
	 * Enter a parse tree produced by {@link URIParser#hexdigit}.
	 * @param ctx the parse tree
	 */
	void enterHexdigit(URIParser.HexdigitContext ctx);
	/**
	 * Exit a parse tree produced by {@link URIParser#hexdigit}.
	 * @param ctx the parse tree
	 */
	void exitHexdigit(URIParser.HexdigitContext ctx);
}