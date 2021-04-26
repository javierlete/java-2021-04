<map version="freeplane 1.8.0">
<!--To view this file, download free mind mapping software Freeplane from http://freeplane.sourceforge.net -->
<node TEXT="ArrayListEjercicio2" FOLDED="false" ID="ID_1829263133" CREATED="1619419741685" MODIFIED="1619419791522" STYLE="oval">
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
<hook NAME="AutomaticEdgeColor" COUNTER="14" RULE="ON_BRANCH_CREATION"/>
<node TEXT="2. Leer números por teclado hasta introducir -99. Calcular la suma, la media y cuántos son mayores que la media." POSITION="right" ID="ID_1735562694" CREATED="1619419760261" MODIFIED="1619419775770">
<edge COLOR="#ff0000"/>
</node>
<node TEXT="Variables" POSITION="right" ID="ID_494461509" CREATED="1619419827554" MODIFIED="1619419832853">
<edge COLOR="#00ff00"/>
<node TEXT="listaNumeros (ArrayList)" ID="ID_1283868994" CREATED="1619420087431" MODIFIED="1619420100892"/>
<node TEXT="suma" ID="ID_829375134" CREATED="1619419833092" MODIFIED="1619420162208"/>
<node TEXT="media" ID="ID_237999405" CREATED="1619419836606" MODIFIED="1619419837835"/>
<node TEXT="cuantosMayorQueMedia" ID="ID_737142442" CREATED="1619419838385" MODIFIED="1619419890418"/>
<node TEXT="numero" ID="ID_1520375539" CREATED="1619419854887" MODIFIED="1619419856439"/>
</node>
<node TEXT="suma = 0" POSITION="right" ID="ID_271080361" CREATED="1619420154851" MODIFIED="1619420157175">
<edge COLOR="#007c00"/>
</node>
<node TEXT="Repetir&#xa;(Hasta -99)" POSITION="right" ID="ID_396562219" CREATED="1619419801228" MODIFIED="1619419818448">
<edge COLOR="#0000ff"/>
<node TEXT="Introducir numero" ID="ID_1751119853" CREATED="1619419897784" MODIFIED="1619419902026"/>
<node TEXT="Si numero != -99" ID="ID_695428802" CREATED="1619420755311" MODIFIED="1619420762554">
<node TEXT="Añadir a listaNumeros" ID="ID_623885433" CREATED="1619420132572" MODIFIED="1619420138095"/>
<node TEXT="suma += numero" ID="ID_367823930" CREATED="1619419911470" MODIFIED="1619420210544"/>
</node>
</node>
<node TEXT="media = suma / listaNumeros.size()" POSITION="right" ID="ID_753106202" CREATED="1619419944895" MODIFIED="1619420592822">
<edge COLOR="#ff00ff"/>
</node>
<node TEXT="cuantosMayorQueMedia = 0" POSITION="right" ID="ID_819620954" CREATED="1619420245179" MODIFIED="1619420250447">
<edge COLOR="#0000ff"/>
</node>
<node TEXT="Por cada numero de listaNumeros" POSITION="right" ID="ID_491789942" CREATED="1619420109535" MODIFIED="1619420118164">
<edge COLOR="#00007c"/>
<node TEXT="Si el n &gt; media" ID="ID_1071730872" CREATED="1619420227230" MODIFIED="1619420677283">
<node TEXT="cuantosMayorQueMedia++" ID="ID_792589188" CREATED="1619420269488" MODIFIED="1619420279566"/>
</node>
</node>
<node TEXT="Mostrar suma" POSITION="right" ID="ID_508849298" CREATED="1619420014944" MODIFIED="1619420021867">
<edge COLOR="#00ffff"/>
</node>
<node TEXT="Mostrar media" POSITION="right" ID="ID_1660587415" CREATED="1619420022011" MODIFIED="1619420024191">
<edge COLOR="#7c0000"/>
</node>
<node TEXT="Mostrar cuantosMayorQueMedia" POSITION="right" ID="ID_632581910" CREATED="1619420284413" MODIFIED="1619420289683">
<edge COLOR="#00ff00"/>
</node>
</node>
</map>
