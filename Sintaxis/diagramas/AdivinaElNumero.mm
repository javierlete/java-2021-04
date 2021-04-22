<map version="freeplane 1.8.0">
<!--To view this file, download free mind mapping software Freeplane from http://freeplane.sourceforge.net -->
<node TEXT="AdivinaElNumero" FOLDED="false" ID="ID_1868161002" CREATED="1619075385088" MODIFIED="1619075402673" STYLE="oval">
<font SIZE="18"/>
<hook NAME="MapStyle" zoom="1.5">
    <properties edgeColorConfiguration="#808080ff,#ff0000ff,#0000ffff,#00ff00ff,#ff00ffff,#00ffffff,#7c0000ff,#00007cff,#007c00ff,#7c007cff,#007c7cff,#7c7c00ff" fit_to_viewport="false"/>

<map_styles>
<stylenode LOCALIZED_TEXT="styles.root_node" STYLE="oval" UNIFORM_SHAPE="true" VGAP_QUANTITY="24.0 pt">
<font SIZE="24"/>
<stylenode LOCALIZED_TEXT="styles.predefined" POSITION="right" STYLE="bubble">
<stylenode LOCALIZED_TEXT="default" ICON_SIZE="12.0 pt" COLOR="#000000" STYLE="fork">
<font NAME="SansSerif" SIZE="10" BOLD="false" ITALIC="false"/>
</stylenode>
<stylenode LOCALIZED_TEXT="defaultstyle.details"/>
<stylenode LOCALIZED_TEXT="defaultstyle.attributes">
<font SIZE="9"/>
</stylenode>
<stylenode LOCALIZED_TEXT="defaultstyle.note" COLOR="#000000" BACKGROUND_COLOR="#ffffff" TEXT_ALIGN="LEFT"/>
<stylenode LOCALIZED_TEXT="defaultstyle.floating">
<edge STYLE="hide_edge"/>
<cloud COLOR="#f0f0f0" SHAPE="ROUND_RECT"/>
</stylenode>
</stylenode>
<stylenode LOCALIZED_TEXT="styles.user-defined" POSITION="right" STYLE="bubble">
<stylenode LOCALIZED_TEXT="styles.topic" COLOR="#18898b" STYLE="fork">
<font NAME="Liberation Sans" SIZE="10" BOLD="true"/>
</stylenode>
<stylenode LOCALIZED_TEXT="styles.subtopic" COLOR="#cc3300" STYLE="fork">
<font NAME="Liberation Sans" SIZE="10" BOLD="true"/>
</stylenode>
<stylenode LOCALIZED_TEXT="styles.subsubtopic" COLOR="#669900">
<font NAME="Liberation Sans" SIZE="10" BOLD="true"/>
</stylenode>
<stylenode LOCALIZED_TEXT="styles.important">
<icon BUILTIN="yes"/>
</stylenode>
</stylenode>
<stylenode LOCALIZED_TEXT="styles.AutomaticLayout" POSITION="right" STYLE="bubble">
<stylenode LOCALIZED_TEXT="AutomaticLayout.level.root" COLOR="#000000" STYLE="oval" SHAPE_HORIZONTAL_MARGIN="10.0 pt" SHAPE_VERTICAL_MARGIN="10.0 pt">
<font SIZE="18"/>
</stylenode>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,1" COLOR="#0033ff">
<font SIZE="16"/>
</stylenode>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,2" COLOR="#00b439">
<font SIZE="14"/>
</stylenode>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,3" COLOR="#990000">
<font SIZE="12"/>
</stylenode>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,4" COLOR="#111111">
<font SIZE="10"/>
</stylenode>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,5"/>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,6"/>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,7"/>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,8"/>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,9"/>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,10"/>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,11"/>
</stylenode>
</stylenode>
</map_styles>
</hook>
<hook NAME="AutomaticEdgeColor" COUNTER="2" RULE="ON_BRANCH_CREATION"/>
<node TEXT="variables" POSITION="right" ID="ID_558988916" CREATED="1619076535550" MODIFIED="1619076541455">
<edge COLOR="#0000ff"/>
<node TEXT="objetivo" ID="ID_865693898" CREATED="1619076541769" MODIFIED="1619076543532"/>
<node TEXT="numero" ID="ID_1738181383" CREATED="1619076543659" MODIFIED="1619076544900"/>
</node>
<node TEXT="main" POSITION="right" ID="ID_1975959465" CREATED="1619075412231" MODIFIED="1619075415743">
<edge COLOR="#ff0000"/>
<node TEXT="generarNumeroAleatorio" ID="ID_1860047675" CREATED="1619075872872" MODIFIED="1619075881153">
<node TEXT="generar un número entre 1 y 100" ID="ID_564177088" CREATED="1619075895714" MODIFIED="1619076733720"/>
</node>
<node TEXT="Mostrar objetivo" ID="ID_1211684031" CREATED="1619075418433" MODIFIED="1619075432463"/>
<node TEXT="hacer mientras !haAcertado" ID="ID_1505654309" CREATED="1619075433889" MODIFIED="1619076368107">
<node TEXT="pedirNumero" ID="ID_215950445" CREATED="1619075520920" MODIFIED="1619075528503">
<node TEXT="hacer mientras !esNumeroCorrecto()" ID="ID_1759156976" CREATED="1619075606294" MODIFIED="1619077020165">
<node TEXT="numero = leerInt(&quot;&quot;)" ID="ID_189489946" CREATED="1619075617076" MODIFIED="1619075627466"/>
</node>
<node TEXT="(esNumeroCorrecto)" ID="ID_1798725776" CREATED="1619075690985" MODIFIED="1619075695237">
<node TEXT="numero comprendido entre 1 y 100" ID="ID_27258579" CREATED="1619075695534" MODIFIED="1619077065147">
<node TEXT="true" ID="ID_1152359953" CREATED="1619075731283" MODIFIED="1619075739640">
<node TEXT="Devuelve true" ID="ID_1472063043" CREATED="1619075770075" MODIFIED="1619075772304"/>
</node>
<node TEXT="false" ID="ID_886137697" CREATED="1619075719669" MODIFIED="1619075742200">
<node TEXT="Muestra mensaje error" ID="ID_1855661204" CREATED="1619075757958" MODIFIED="1619075763903"/>
<node TEXT="Devuelve false" ID="ID_1206728899" CREATED="1619075713314" MODIFIED="1619075749216"/>
</node>
</node>
</node>
</node>
<node TEXT="mostrarMensaje" ID="ID_230758418" CREATED="1619075528711" MODIFIED="1619075531236">
<node TEXT="numero &lt; objetivo" ID="ID_58200829" CREATED="1619075793880" MODIFIED="1619075824763">
<node TEXT="true" ID="ID_1030951717" CREATED="1619075825643" MODIFIED="1619075826929">
<node TEXT="Mostrar menor" ID="ID_884958338" CREATED="1619075832179" MODIFIED="1619075838485"/>
</node>
<node TEXT="false" ID="ID_1004588563" CREATED="1619075827226" MODIFIED="1619075828126">
<node TEXT="numero &gt; objetivo" ID="ID_1202843582" CREATED="1619075840645" MODIFIED="1619075845288">
<node TEXT="true" ID="ID_1220789809" CREATED="1619075845776" MODIFIED="1619075846901">
<node TEXT="Mostrar mayor" ID="ID_497375971" CREATED="1619075849978" MODIFIED="1619075852425"/>
</node>
<node TEXT="false" ID="ID_1514414707" CREATED="1619075847206" MODIFIED="1619075848290">
<node TEXT="Mostrar has acertado" ID="ID_1519076872" CREATED="1619075853154" MODIFIED="1619075861363"/>
</node>
</node>
</node>
</node>
</node>
</node>
<node TEXT="(haAcertado)" ID="ID_1985364418" CREATED="1619075586732" MODIFIED="1619075592274">
<node TEXT="numero == objetivo" ID="ID_761473234" CREATED="1619075592781" MODIFIED="1619075597292"/>
</node>
</node>
</node>
</map>
