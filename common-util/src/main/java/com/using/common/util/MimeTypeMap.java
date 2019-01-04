package com.using.common.util;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

class MimeTypeMap {

	public static String getValue(String key) {
		if (StringUtils.isBlank(key))
			return DEFAULT_MIME_TYPE;

		key = key.toLowerCase();
		String value = mimeTypeMap.get(key);
		if (StringUtils.isBlank(value))
			return DEFAULT_MIME_TYPE;

		return value;
	}

	private static final String DEFAULT_MIME_TYPE = "application/octet-stream";
	private static final Map<String, String> mimeTypeMap = new HashMap<>();
	static {
		mimeTypeMap.put("001", "application/x-001");
		mimeTypeMap.put("123", "application/vnd.lotus-1-2-3");
		mimeTypeMap.put("301", "application/x-301");
		mimeTypeMap.put("323", "text/h323");
		mimeTypeMap.put("3ds", "image/x-3ds");
		mimeTypeMap.put("3g2", "video/3gpp");
		mimeTypeMap.put("3ga", "video/3gpp");
		mimeTypeMap.put("3gp", "video/3gpp");
		mimeTypeMap.put("3gpp", "video/3gpp");
		mimeTypeMap.put("602", "application/x-t602");
		mimeTypeMap.put("669", "audio/x-mod");
		mimeTypeMap.put("7z", "application/x-7z-compressed");
		mimeTypeMap.put("906", "application/x-906");
		mimeTypeMap.put("907", "drawing/907");
		mimeTypeMap.put("a", "application/x-archive");
		mimeTypeMap.put("a11", "application/x-a11");
		mimeTypeMap.put("aac", "audio/mp4");
		mimeTypeMap.put("abw", "application/x-abiword");
		mimeTypeMap.put("abw.crashed", "application/x-abiword");
		mimeTypeMap.put("abw.gz", "application/x-abiword");
		mimeTypeMap.put("ac3", "audio/ac3");
		mimeTypeMap.put("ace", "application/x-ace");
		mimeTypeMap.put("adb", "text/x-adasrc");
		mimeTypeMap.put("ads", "text/x-adasrc");
		mimeTypeMap.put("afm", "application/x-font-afm");
		mimeTypeMap.put("ag", "image/x-applix-graphics");
		mimeTypeMap.put("ai", "application/illustrator");
		mimeTypeMap.put("aif", "audio/x-aiff");
		mimeTypeMap.put("aifc", "audio/x-aiff");
		mimeTypeMap.put("aiff", "audio/x-aiff");
		mimeTypeMap.put("al", "application/x-perl");
		mimeTypeMap.put("alz", "application/x-alz");
		mimeTypeMap.put("amr", "audio/amr");
		mimeTypeMap.put("ani", "application/x-navi-animation");
		mimeTypeMap.put("anim[1-9j]", "video/x-anim");
		mimeTypeMap.put("anx", "application/annodex");
		mimeTypeMap.put("ape", "audio/x-ape");
		mimeTypeMap.put("arj", "application/x-arj");
		mimeTypeMap.put("arw", "image/x-sony-arw");
		mimeTypeMap.put("as", "application/x-applix-spreadsheet");
		mimeTypeMap.put("asc", "text/plain");
		mimeTypeMap.put("asf", "video/x-ms-asf");
		mimeTypeMap.put("asp", "application/x-asp");
		mimeTypeMap.put("ass", "text/x-ssa");
		mimeTypeMap.put("asx", "audio/x-ms-asx");
		mimeTypeMap.put("atom", "application/atom+xml");
		mimeTypeMap.put("au", "audio/basic");
		mimeTypeMap.put("avi", "video/x-msvideo");
		mimeTypeMap.put("aw", "application/x-applix-word");
		mimeTypeMap.put("awb", "audio/amr-wb");
		mimeTypeMap.put("awk", "application/x-awk");
		mimeTypeMap.put("axa", "audio/annodex");
		mimeTypeMap.put("axv", "video/annodex");
		mimeTypeMap.put("bak", "application/x-trash");
		mimeTypeMap.put("bcpio", "application/x-bcpio");
		mimeTypeMap.put("bdf", "application/x-font-bdf");
		mimeTypeMap.put("bib", "text/x-bibtex");
		mimeTypeMap.put("bin", "application/octet-stream");
		mimeTypeMap.put("blend", "application/x-blender");
		mimeTypeMap.put("blender", "application/x-blender");
		mimeTypeMap.put("bmp", "image/bmp");
		mimeTypeMap.put("bz", "application/x-bzip");
		mimeTypeMap.put("bz2", "application/x-bzip");
		mimeTypeMap.put("c", "text/x-csrc");
		mimeTypeMap.put("c++", "text/x-c++src");
		mimeTypeMap.put("cab", "application/vnd.ms-cab-compressed");
		mimeTypeMap.put("cb7", "application/x-cb7");
		mimeTypeMap.put("cbr", "application/x-cbr");
		mimeTypeMap.put("cbt", "application/x-cbt");
		mimeTypeMap.put("cbz", "application/x-cbz");
		mimeTypeMap.put("cc", "text/x-c++src");
		mimeTypeMap.put("cdf", "application/x-netcdf");
		mimeTypeMap.put("cdr", "application/vnd.corel-draw");
		mimeTypeMap.put("cer", "application/x-x509-ca-cert");
		mimeTypeMap.put("cert", "application/x-x509-ca-cert");
		mimeTypeMap.put("cgm", "image/cgm");
		mimeTypeMap.put("chm", "application/x-chm");
		mimeTypeMap.put("chrt", "application/x-kchart");
		mimeTypeMap.put("class", "application/x-java");
		mimeTypeMap.put("cls", "text/x-tex");
		mimeTypeMap.put("cmake", "text/x-cmake");
		mimeTypeMap.put("cpio", "application/x-cpio");
		mimeTypeMap.put("cpio.gz", "application/x-cpio-compressed");
		mimeTypeMap.put("cpp", "text/x-c++src");
		mimeTypeMap.put("cr2", "image/x-canon-cr2");
		mimeTypeMap.put("crt", "application/x-x509-ca-cert");
		mimeTypeMap.put("crw", "image/x-canon-crw");
		mimeTypeMap.put("cs", "text/x-csharp");
		mimeTypeMap.put("csh", "application/x-csh");
		mimeTypeMap.put("css", "text/css");
		mimeTypeMap.put("cssl", "text/css");
		mimeTypeMap.put("csv", "text/csv");
		mimeTypeMap.put("cue", "application/x-cue");
		mimeTypeMap.put("cur", "image/x-win-bitmap");
		mimeTypeMap.put("cxx", "text/x-c++src");
		mimeTypeMap.put("d", "text/x-dsrc");
		mimeTypeMap.put("dar", "application/x-dar");
		mimeTypeMap.put("dbf", "application/x-dbf");
		mimeTypeMap.put("dc", "application/x-dc-rom");
		mimeTypeMap.put("dcl", "text/x-dcl");
		mimeTypeMap.put("dcm", "application/dicom");
		mimeTypeMap.put("dcr", "image/x-kodak-dcr");
		mimeTypeMap.put("dds", "image/x-dds");
		mimeTypeMap.put("deb", "application/x-deb");
		mimeTypeMap.put("der", "application/x-x509-ca-cert");
		mimeTypeMap.put("desktop", "application/x-desktop");
		mimeTypeMap.put("dia", "application/x-dia-diagram");
		mimeTypeMap.put("diff", "text/x-patch");
		mimeTypeMap.put("divx", "video/x-msvideo");
		mimeTypeMap.put("djv", "image/vnd.djvu");
		mimeTypeMap.put("djvu", "image/vnd.djvu");
		mimeTypeMap.put("dng", "image/x-adobe-dng");
		mimeTypeMap.put("doc", "application/msword");
		mimeTypeMap.put("docbook", "application/docbook+xml");
		mimeTypeMap.put("docm", "application/vnd.openxmlformats-officedocument.wordprocessingml.document");
		mimeTypeMap.put("docx", "application/vnd.openxmlformats-officedocument.wordprocessingml.document");
		mimeTypeMap.put("dot", "text/vnd.graphviz");
		mimeTypeMap.put("dsl", "text/x-dsl");
		mimeTypeMap.put("dtd", "application/xml-dtd");
		mimeTypeMap.put("dtx", "text/x-tex");
		mimeTypeMap.put("dv", "video/dv");
		mimeTypeMap.put("dvi", "application/x-dvi");
		mimeTypeMap.put("dvi.bz2", "application/x-bzdvi");
		mimeTypeMap.put("dvi.gz", "application/x-gzdvi");
		mimeTypeMap.put("dwg", "image/vnd.dwg");
		mimeTypeMap.put("dxf", "image/vnd.dxf");
		mimeTypeMap.put("e", "text/x-eiffel");
		mimeTypeMap.put("egon", "application/x-egon");
		mimeTypeMap.put("eif", "text/x-eiffel");
		mimeTypeMap.put("el", "text/x-emacs-lisp");
		mimeTypeMap.put("emf", "image/x-emf");
		mimeTypeMap.put("emp", "application/vnd.emusic-emusic_package");
		mimeTypeMap.put("ent", "application/xml-external-parsed-entity");
		mimeTypeMap.put("eps", "image/x-eps");
		mimeTypeMap.put("eps.bz2", "image/x-bzeps");
		mimeTypeMap.put("eps.gz", "image/x-gzeps");
		mimeTypeMap.put("epsf", "image/x-eps");
		mimeTypeMap.put("epsf.bz2", "image/x-bzeps");
		mimeTypeMap.put("epsf.gz", "image/x-gzeps");
		mimeTypeMap.put("epsi", "image/x-eps");
		mimeTypeMap.put("epsi.bz2", "image/x-bzeps");
		mimeTypeMap.put("epsi.gz", "image/x-gzeps");
		mimeTypeMap.put("epub", "application/epub+zip");
		mimeTypeMap.put("erl", "text/x-erlang");
		mimeTypeMap.put("es", "application/ecmascript");
		mimeTypeMap.put("etheme", "application/x-e-theme");
		mimeTypeMap.put("etx", "text/x-setext");
		mimeTypeMap.put("exe", "application/x-ms-dos-executable");
		mimeTypeMap.put("exr", "image/x-exr");
		mimeTypeMap.put("ez", "application/andrew-inset");
		mimeTypeMap.put("f", "text/x-fortran");
		mimeTypeMap.put("f90", "text/x-fortran");
		mimeTypeMap.put("f95", "text/x-fortran");
		mimeTypeMap.put("fb2", "application/x-fictionbook+xml");
		mimeTypeMap.put("fig", "image/x-xfig");
		mimeTypeMap.put("fits", "image/fits");
		mimeTypeMap.put("fl", "application/x-fluid");
		mimeTypeMap.put("flac", "audio/x-flac");
		mimeTypeMap.put("flc", "video/x-flic");
		mimeTypeMap.put("fli", "video/x-flic");
		mimeTypeMap.put("flv", "video/x-flv");
		mimeTypeMap.put("flw", "application/x-kivio");
		mimeTypeMap.put("fo", "text/x-xslfo");
		mimeTypeMap.put("for", "text/x-fortran");
		mimeTypeMap.put("g3", "image/fax-g3");
		mimeTypeMap.put("gb", "application/x-gameboy-rom");
		mimeTypeMap.put("gba", "application/x-gba-rom");
		mimeTypeMap.put("gcrd", "text/directory");
		mimeTypeMap.put("ged", "application/x-gedcom");
		mimeTypeMap.put("gedcom", "application/x-gedcom");
		mimeTypeMap.put("gen", "application/x-genesis-rom");
		mimeTypeMap.put("gf", "application/x-tex-gf");
		mimeTypeMap.put("gg", "application/x-sms-rom");
		mimeTypeMap.put("gif", "image/gif");
		mimeTypeMap.put("glade", "application/x-glade");
		mimeTypeMap.put("gmo", "application/x-gettext-translation");
		mimeTypeMap.put("gnc", "application/x-gnucash");
		mimeTypeMap.put("gnd", "application/gnunet-directory");
		mimeTypeMap.put("gnucash", "application/x-gnucash");
		mimeTypeMap.put("gnumeric", "application/x-gnumeric");
		mimeTypeMap.put("gnuplot", "application/x-gnuplot");
		mimeTypeMap.put("gp", "application/x-gnuplot");
		mimeTypeMap.put("gpg", "application/pgp-encrypted");
		mimeTypeMap.put("gplt", "application/x-gnuplot");
		mimeTypeMap.put("gra", "application/x-graphite");
		mimeTypeMap.put("gsf", "application/x-font-type1");
		mimeTypeMap.put("gsm", "audio/x-gsm");
		mimeTypeMap.put("gtar", "application/x-tar");
		mimeTypeMap.put("gv", "text/vnd.graphviz");
		mimeTypeMap.put("gvp", "text/x-google-video-pointer");
		mimeTypeMap.put("gz", "application/x-gzip");
		mimeTypeMap.put("h", "text/x-chdr");
		mimeTypeMap.put("h++", "text/x-c++hdr");
		mimeTypeMap.put("hdf", "application/x-hdf");
		mimeTypeMap.put("hh", "text/x-c++hdr");
		mimeTypeMap.put("hp", "text/x-c++hdr");
		mimeTypeMap.put("hpgl", "application/vnd.hp-hpgl");
		mimeTypeMap.put("hpp", "text/x-c++hdr");
		mimeTypeMap.put("hs", "text/x-haskell");
		mimeTypeMap.put("htm", "text/html");
		mimeTypeMap.put("html", "text/html");
		mimeTypeMap.put("hwp", "application/x-hwp");
		mimeTypeMap.put("hwt", "application/x-hwt");
		mimeTypeMap.put("hxx", "text/x-c++hdr");
		mimeTypeMap.put("ica", "application/x-ica");
		mimeTypeMap.put("icb", "image/x-tga");
		mimeTypeMap.put("icns", "image/x-icns");
		mimeTypeMap.put("ico", "image/vnd.microsoft.icon");
		mimeTypeMap.put("ics", "text/calendar");
		mimeTypeMap.put("idl", "text/x-idl");
		mimeTypeMap.put("ief", "image/ief");
		mimeTypeMap.put("iff", "image/x-iff");
		mimeTypeMap.put("ilbm", "image/x-ilbm");
		mimeTypeMap.put("ime", "text/x-imelody");
		mimeTypeMap.put("imy", "text/x-imelody");
		mimeTypeMap.put("ins", "text/x-tex");
		mimeTypeMap.put("iptables", "text/x-iptables");
		mimeTypeMap.put("iso", "application/x-cd-image");
		mimeTypeMap.put("iso9660", "application/x-cd-image");
		mimeTypeMap.put("it", "audio/x-it");
		mimeTypeMap.put("j2k", "image/jp2");
		mimeTypeMap.put("jad", "text/vnd.sun.j2me.app-descriptor");
		mimeTypeMap.put("jar", "application/x-java-archive");
		mimeTypeMap.put("java", "text/x-java");
		mimeTypeMap.put("jng", "image/x-jng");
		mimeTypeMap.put("jnlp", "application/x-java-jnlp-file");
		mimeTypeMap.put("jp2", "image/jp2");
		mimeTypeMap.put("jpc", "image/jp2");
		mimeTypeMap.put("jpe", "image/jpeg");
		mimeTypeMap.put("jpeg", "image/jpeg");
		mimeTypeMap.put("jpf", "image/jp2");
		mimeTypeMap.put("jpg", "image/jpeg");
		mimeTypeMap.put("jpr", "application/x-jbuilder-project");
		mimeTypeMap.put("jpx", "image/jp2");
		mimeTypeMap.put("js", "application/javascript");
		mimeTypeMap.put("json", "application/json");
		mimeTypeMap.put("jsonp", "application/jsonp");
		mimeTypeMap.put("k25", "image/x-kodak-k25");
		mimeTypeMap.put("kar", "audio/midi");
		mimeTypeMap.put("karbon", "application/x-karbon");
		mimeTypeMap.put("kdc", "image/x-kodak-kdc");
		mimeTypeMap.put("kdelnk", "application/x-desktop");
		mimeTypeMap.put("kexi", "application/x-kexiproject-sqlite3");
		mimeTypeMap.put("kexic", "application/x-kexi-connectiondata");
		mimeTypeMap.put("kexis", "application/x-kexiproject-shortcut");
		mimeTypeMap.put("kfo", "application/x-kformula");
		mimeTypeMap.put("kil", "application/x-killustrator");
		mimeTypeMap.put("kino", "application/smil");
		mimeTypeMap.put("kml", "application/vnd.google-earth.kml+xml");
		mimeTypeMap.put("kmz", "application/vnd.google-earth.kmz");
		mimeTypeMap.put("kon", "application/x-kontour");
		mimeTypeMap.put("kpm", "application/x-kpovmodeler");
		mimeTypeMap.put("kpr", "application/x-kpresenter");
		mimeTypeMap.put("kpt", "application/x-kpresenter");
		mimeTypeMap.put("kra", "application/x-krita");
		mimeTypeMap.put("ksp", "application/x-kspread");
		mimeTypeMap.put("kud", "application/x-kugar");
		mimeTypeMap.put("kwd", "application/x-kword");
		mimeTypeMap.put("kwt", "application/x-kword");
		mimeTypeMap.put("la", "application/x-shared-library-la");
		mimeTypeMap.put("latex", "text/x-tex");
		mimeTypeMap.put("ldif", "text/x-ldif");
		mimeTypeMap.put("lha", "application/x-lha");
		mimeTypeMap.put("lhs", "text/x-literate-haskell");
		mimeTypeMap.put("lhz", "application/x-lhz");
		mimeTypeMap.put("load", "text/html");
		mimeTypeMap.put("log", "text/x-log");
		mimeTypeMap.put("ltx", "text/x-tex");
		mimeTypeMap.put("lua", "text/x-lua");
		mimeTypeMap.put("lwo", "image/x-lwo");
		mimeTypeMap.put("lwob", "image/x-lwo");
		mimeTypeMap.put("lws", "image/x-lws");
		mimeTypeMap.put("ly", "text/x-lilypond");
		mimeTypeMap.put("lyx", "application/x-lyx");
		mimeTypeMap.put("lz", "application/x-lzip");
		mimeTypeMap.put("lzh", "application/x-lha");
		mimeTypeMap.put("lzma", "application/x-lzma");
		mimeTypeMap.put("lzo", "application/x-lzop");
		mimeTypeMap.put("m", "text/x-matlab");
		mimeTypeMap.put("m15", "audio/x-mod");
		mimeTypeMap.put("m2t", "video/mpeg");
		mimeTypeMap.put("m3u", "audio/x-mpegurl");
		mimeTypeMap.put("m3u8", "audio/x-mpegurl");
		mimeTypeMap.put("m4", "application/x-m4");
		mimeTypeMap.put("m4a", "audio/mp4");
		mimeTypeMap.put("m4b", "audio/x-m4b");
		mimeTypeMap.put("m4v", "video/mp4");
		mimeTypeMap.put("mab", "application/x-markaby");
		mimeTypeMap.put("man", "application/x-troff-man");
		mimeTypeMap.put("mbox", "application/mbox");
		mimeTypeMap.put("md", "application/x-genesis-rom");
		mimeTypeMap.put("mdb", "application/vnd.ms-access");
		mimeTypeMap.put("mdi", "image/vnd.ms-modi");
		mimeTypeMap.put("me", "text/x-troff-me");
		mimeTypeMap.put("med", "audio/x-mod");
		mimeTypeMap.put("metalink", "application/metalink+xml");
		mimeTypeMap.put("mgp", "application/x-magicpoint");
		mimeTypeMap.put("mid", "audio/midi");
		mimeTypeMap.put("midi", "audio/midi");
		mimeTypeMap.put("mif", "application/x-mif");
		mimeTypeMap.put("minipsf", "audio/x-minipsf");
		mimeTypeMap.put("mka", "audio/x-matroska");
		mimeTypeMap.put("mkv", "video/x-matroska");
		mimeTypeMap.put("ml", "text/x-ocaml");
		mimeTypeMap.put("mli", "text/x-ocaml");
		mimeTypeMap.put("mm", "text/x-troff-mm");
		mimeTypeMap.put("mmf", "application/x-smaf");
		mimeTypeMap.put("mml", "text/mathml");
		mimeTypeMap.put("mng", "video/x-mng");
		mimeTypeMap.put("mo", "application/x-gettext-translation");
		mimeTypeMap.put("mo3", "audio/x-mo3");
		mimeTypeMap.put("moc", "text/x-moc");
		mimeTypeMap.put("mod", "audio/x-mod");
		mimeTypeMap.put("mof", "text/x-mof");
		mimeTypeMap.put("moov", "video/quicktime");
		mimeTypeMap.put("mov", "video/quicktime");
		mimeTypeMap.put("movie", "video/x-sgi-movie");
		mimeTypeMap.put("mp+", "audio/x-musepack");
		mimeTypeMap.put("mp2", "video/mpeg");
		mimeTypeMap.put("mp3", "audio/mpeg");
		mimeTypeMap.put("mp4", "video/mp4");
		mimeTypeMap.put("mpc", "audio/x-musepack");
		mimeTypeMap.put("mpe", "video/mpeg");
		mimeTypeMap.put("mpeg", "video/mpeg");
		mimeTypeMap.put("mpg", "video/mpeg");
		mimeTypeMap.put("mpga", "audio/mpeg");
		mimeTypeMap.put("mpp", "audio/x-musepack");
		mimeTypeMap.put("mrl", "text/x-mrml");
		mimeTypeMap.put("mrml", "text/x-mrml");
		mimeTypeMap.put("mrw", "image/x-minolta-mrw");
		mimeTypeMap.put("ms", "text/x-troff-ms");
		mimeTypeMap.put("msi", "application/x-msi");
		mimeTypeMap.put("msod", "image/x-msod");
		mimeTypeMap.put("msx", "application/x-msx-rom");
		mimeTypeMap.put("mtm", "audio/x-mod");
		mimeTypeMap.put("mup", "text/x-mup");
		mimeTypeMap.put("mxf", "application/mxf");
		mimeTypeMap.put("n64", "application/x-n64-rom");
		mimeTypeMap.put("nb", "application/mathematica");
		mimeTypeMap.put("nc", "application/x-netcdf");
		mimeTypeMap.put("nds", "application/x-nintendo-ds-rom");
		mimeTypeMap.put("nef", "image/x-nikon-nef");
		mimeTypeMap.put("nes", "application/x-nes-rom");
		mimeTypeMap.put("nfo", "text/x-nfo");
		mimeTypeMap.put("not", "text/x-mup");
		mimeTypeMap.put("nsc", "application/x-netshow-channel");
		mimeTypeMap.put("nsv", "video/x-nsv");
		mimeTypeMap.put("o", "application/x-object");
		mimeTypeMap.put("obj", "application/x-tgif");
		mimeTypeMap.put("ocl", "text/x-ocl");
		mimeTypeMap.put("oda", "application/oda");
		mimeTypeMap.put("odb", "application/vnd.oasis.opendocument.database");
		mimeTypeMap.put("odc", "application/vnd.oasis.opendocument.chart");
		mimeTypeMap.put("odf", "application/vnd.oasis.opendocument.formula");
		mimeTypeMap.put("odg", "application/vnd.oasis.opendocument.graphics");
		mimeTypeMap.put("odi", "application/vnd.oasis.opendocument.image");
		mimeTypeMap.put("odm", "application/vnd.oasis.opendocument.text-master");
		mimeTypeMap.put("odp", "application/vnd.oasis.opendocument.presentation");
		mimeTypeMap.put("ods", "application/vnd.oasis.opendocument.spreadsheet");
		mimeTypeMap.put("odt", "application/vnd.oasis.opendocument.text");
		mimeTypeMap.put("oga", "audio/ogg");
		mimeTypeMap.put("ogg", "video/x-theora+ogg");
		mimeTypeMap.put("ogm", "video/x-ogm+ogg");
		mimeTypeMap.put("ogv", "video/ogg");
		mimeTypeMap.put("ogx", "application/ogg");
		mimeTypeMap.put("old", "application/x-trash");
		mimeTypeMap.put("oleo", "application/x-oleo");
		mimeTypeMap.put("opml", "text/x-opml+xml");
		mimeTypeMap.put("ora", "image/openraster");
		mimeTypeMap.put("orf", "image/x-olympus-orf");
		mimeTypeMap.put("otc", "application/vnd.oasis.opendocument.chart-template");
		mimeTypeMap.put("otf", "application/x-font-otf");
		mimeTypeMap.put("otg", "application/vnd.oasis.opendocument.graphics-template");
		mimeTypeMap.put("oth", "application/vnd.oasis.opendocument.text-web");
		mimeTypeMap.put("otp", "application/vnd.oasis.opendocument.presentation-template");
		mimeTypeMap.put("ots", "application/vnd.oasis.opendocument.spreadsheet-template");
		mimeTypeMap.put("ott", "application/vnd.oasis.opendocument.text-template");
		mimeTypeMap.put("owl", "application/rdf+xml");
		mimeTypeMap.put("oxt", "application/vnd.openofficeorg.extension");
		mimeTypeMap.put("p", "text/x-pascal");
		mimeTypeMap.put("p10", "application/pkcs10");
		mimeTypeMap.put("p12", "application/x-pkcs12");
		mimeTypeMap.put("p7b", "application/x-pkcs7-certificates");
		mimeTypeMap.put("p7s", "application/pkcs7-signature");
		mimeTypeMap.put("pack", "application/x-java-pack200");
		mimeTypeMap.put("pak", "application/x-pak");
		mimeTypeMap.put("par2", "application/x-par2");
		mimeTypeMap.put("pas", "text/x-pascal");
		mimeTypeMap.put("patch", "text/x-patch");
		mimeTypeMap.put("pbm", "image/x-portable-bitmap");
		mimeTypeMap.put("pcd", "image/x-photo-cd");
		mimeTypeMap.put("pcf", "application/x-cisco-vpn-settings");
		mimeTypeMap.put("pcf.gz", "application/x-font-pcf");
		mimeTypeMap.put("pcf.z", "application/x-font-pcf");
		mimeTypeMap.put("pcl", "application/vnd.hp-pcl");
		mimeTypeMap.put("pcx", "image/x-pcx");
		mimeTypeMap.put("pdb", "chemical/x-pdb");
		mimeTypeMap.put("pdc", "application/x-aportisdoc");
		mimeTypeMap.put("pdf", "application/pdf");
		mimeTypeMap.put("pdf.bz2", "application/x-bzpdf");
		mimeTypeMap.put("pdf.gz", "application/x-gzpdf");
		mimeTypeMap.put("pef", "image/x-pentax-pef");
		mimeTypeMap.put("pem", "application/x-x509-ca-cert");
		mimeTypeMap.put("perl", "application/x-perl");
		mimeTypeMap.put("pfa", "application/x-font-type1");
		mimeTypeMap.put("pfb", "application/x-font-type1");
		mimeTypeMap.put("pfx", "application/x-pkcs12");
		mimeTypeMap.put("pgm", "image/x-portable-graymap");
		mimeTypeMap.put("pgn", "application/x-chess-pgn");
		mimeTypeMap.put("pgp", "application/pgp-encrypted");
		mimeTypeMap.put("php", "application/x-php");
		mimeTypeMap.put("php3", "application/x-php");
		mimeTypeMap.put("php4", "application/x-php");
		mimeTypeMap.put("pict", "image/x-pict");
		mimeTypeMap.put("pict1", "image/x-pict");
		mimeTypeMap.put("pict2", "image/x-pict");
		mimeTypeMap.put("pickle", "application/python-pickle");
		mimeTypeMap.put("pk", "application/x-tex-pk");
		mimeTypeMap.put("pkipath", "application/pkix-pkipath");
		mimeTypeMap.put("pkr", "application/pgp-keys");
		mimeTypeMap.put("pl", "application/x-perl");
		mimeTypeMap.put("pla", "audio/x-iriver-pla");
		mimeTypeMap.put("pln", "application/x-planperfect");
		mimeTypeMap.put("pls", "audio/x-scpls");
		mimeTypeMap.put("pm", "application/x-perl");
		mimeTypeMap.put("png", "image/png");
		mimeTypeMap.put("pnm", "image/x-portable-anymap");
		mimeTypeMap.put("pntg", "image/x-macpaint");
		mimeTypeMap.put("po", "text/x-gettext-translation");
		mimeTypeMap.put("por", "application/x-spss-por");
		mimeTypeMap.put("pot", "text/x-gettext-translation-template");
		mimeTypeMap.put("ppm", "image/x-portable-pixmap");
		mimeTypeMap.put("pps", "application/vnd.ms-powerpoint");
		mimeTypeMap.put("ppt", "application/vnd.ms-powerpoint");
		mimeTypeMap.put("pptm", "application/vnd.openxmlformats-officedocument.presentationml.presentation");
		mimeTypeMap.put("pptx", "application/vnd.openxmlformats-officedocument.presentationml.presentation");
		mimeTypeMap.put("ppz", "application/vnd.ms-powerpoint");
		mimeTypeMap.put("prc", "application/x-palm-database");
		mimeTypeMap.put("ps", "application/postscript");
		mimeTypeMap.put("ps.bz2", "application/x-bzpostscript");
		mimeTypeMap.put("ps.gz", "application/x-gzpostscript");
		mimeTypeMap.put("psd", "image/vnd.adobe.photoshop");
		mimeTypeMap.put("psf", "audio/x-psf");
		mimeTypeMap.put("psf.gz", "application/x-gz-font-linux-psf");
		mimeTypeMap.put("psflib", "audio/x-psflib");
		mimeTypeMap.put("psid", "audio/prs.sid");
		mimeTypeMap.put("psw", "application/x-pocket-word");
		mimeTypeMap.put("pw", "application/x-pw");
		mimeTypeMap.put("py", "text/x-python");
		mimeTypeMap.put("pyc", "application/x-python-bytecode");
		mimeTypeMap.put("pyo", "application/x-python-bytecode");
		mimeTypeMap.put("qif", "image/x-quicktime");
		mimeTypeMap.put("qt", "video/quicktime");
		mimeTypeMap.put("qtif", "image/x-quicktime");
		mimeTypeMap.put("qtl", "application/x-quicktime-media-link");
		mimeTypeMap.put("qtvr", "video/quicktime");
		mimeTypeMap.put("ra", "audio/vnd.rn-realaudio");
		mimeTypeMap.put("raf", "image/x-fuji-raf");
		mimeTypeMap.put("ram", "application/ram");
		mimeTypeMap.put("rar", "application/x-rar");
		mimeTypeMap.put("ras", "image/x-cmu-raster");
		mimeTypeMap.put("raw", "image/x-panasonic-raw");
		mimeTypeMap.put("rax", "audio/vnd.rn-realaudio");
		mimeTypeMap.put("rb", "application/x-ruby");
		mimeTypeMap.put("rdf", "application/rdf+xml");
		mimeTypeMap.put("rdfs", "application/rdf+xml");
		mimeTypeMap.put("reg", "text/x-ms-regedit");
		mimeTypeMap.put("rej", "application/x-reject");
		mimeTypeMap.put("rgb", "image/x-rgb");
		mimeTypeMap.put("rle", "image/rle");
		mimeTypeMap.put("rm", "application/vnd.rn-realmedia");
		mimeTypeMap.put("rmj", "application/vnd.rn-realmedia");
		mimeTypeMap.put("rmm", "application/vnd.rn-realmedia");
		mimeTypeMap.put("rms", "application/vnd.rn-realmedia");
		mimeTypeMap.put("rmvb", "application/vnd.rn-realmedia");
		mimeTypeMap.put("rmx", "application/vnd.rn-realmedia");
		mimeTypeMap.put("roff", "text/troff");
		mimeTypeMap.put("rp", "image/vnd.rn-realpix");
		mimeTypeMap.put("rpm", "application/x-rpm");
		mimeTypeMap.put("rss", "application/rss+xml");
		mimeTypeMap.put("rt", "text/vnd.rn-realtext");
		mimeTypeMap.put("rtf", "application/rtf");
		mimeTypeMap.put("rtx", "text/richtext");
		mimeTypeMap.put("rv", "video/vnd.rn-realvideo");
		mimeTypeMap.put("rvx", "video/vnd.rn-realvideo");
		mimeTypeMap.put("s3m", "audio/x-s3m");
		mimeTypeMap.put("sam", "application/x-amipro");
		mimeTypeMap.put("sami", "application/x-sami");
		mimeTypeMap.put("sav", "application/x-spss-sav");
		mimeTypeMap.put("scm", "text/x-scheme");
		mimeTypeMap.put("sda", "application/vnd.stardivision.draw");
		mimeTypeMap.put("sdc", "application/vnd.stardivision.calc");
		mimeTypeMap.put("sdd", "application/vnd.stardivision.impress");
		mimeTypeMap.put("sdp", "application/sdp");
		mimeTypeMap.put("sds", "application/vnd.stardivision.chart");
		mimeTypeMap.put("sdw", "application/vnd.stardivision.writer");
		mimeTypeMap.put("sgf", "application/x-go-sgf");
		mimeTypeMap.put("sgi", "image/x-sgi");
		mimeTypeMap.put("sgl", "application/vnd.stardivision.writer");
		mimeTypeMap.put("sgm", "text/sgml");
		mimeTypeMap.put("sgml", "text/sgml");
		mimeTypeMap.put("sh", "application/x-shellscript");
		mimeTypeMap.put("shar", "application/x-shar");
		mimeTypeMap.put("shn", "application/x-shorten");
		mimeTypeMap.put("siag", "application/x-siag");
		mimeTypeMap.put("sid", "audio/prs.sid");
		mimeTypeMap.put("sik", "application/x-trash");
		mimeTypeMap.put("sis", "application/vnd.symbian.install");
		mimeTypeMap.put("sisx", "x-epoc/x-sisx-app");
		mimeTypeMap.put("sit", "application/x-stuffit");
		mimeTypeMap.put("siv", "application/sieve");
		mimeTypeMap.put("sk", "image/x-skencil");
		mimeTypeMap.put("sk1", "image/x-skencil");
		mimeTypeMap.put("skr", "application/pgp-keys");
		mimeTypeMap.put("slk", "text/spreadsheet");
		mimeTypeMap.put("smaf", "application/x-smaf");
		mimeTypeMap.put("smc", "application/x-snes-rom");
		mimeTypeMap.put("smd", "application/vnd.stardivision.mail");
		mimeTypeMap.put("smf", "application/vnd.stardivision.math");
		mimeTypeMap.put("smi", "application/x-sami");
		mimeTypeMap.put("smil", "application/smil");
		mimeTypeMap.put("sml", "application/smil");
		mimeTypeMap.put("sms", "application/x-sms-rom");
		mimeTypeMap.put("snd", "audio/basic");
		mimeTypeMap.put("so", "application/x-sharedlib");
		mimeTypeMap.put("spc", "application/x-pkcs7-certificates");
		mimeTypeMap.put("spd", "application/x-font-speedo");
		mimeTypeMap.put("spec", "text/x-rpm-spec");
		mimeTypeMap.put("spl", "application/x-shockwave-flash");
		mimeTypeMap.put("spx", "audio/x-speex");
		mimeTypeMap.put("sql", "text/x-sql");
		mimeTypeMap.put("sr2", "image/x-sony-sr2");
		mimeTypeMap.put("src", "application/x-wais-source");
		mimeTypeMap.put("srf", "image/x-sony-srf");
		mimeTypeMap.put("srt", "application/x-subrip");
		mimeTypeMap.put("ssa", "text/x-ssa");
		mimeTypeMap.put("stc", "application/vnd.sun.xml.calc.template");
		mimeTypeMap.put("std", "application/vnd.sun.xml.draw.template");
		mimeTypeMap.put("sti", "application/vnd.sun.xml.impress.template");
		mimeTypeMap.put("stm", "audio/x-stm");
		mimeTypeMap.put("stw", "application/vnd.sun.xml.writer.template");
		mimeTypeMap.put("sty", "text/x-tex");
		mimeTypeMap.put("sub", "text/x-subviewer");
		mimeTypeMap.put("sun", "image/x-sun-raster");
		mimeTypeMap.put("sv4cpio", "application/x-sv4cpio");
		mimeTypeMap.put("sv4crc", "application/x-sv4crc");
		mimeTypeMap.put("svg", "image/svg+xml");
		mimeTypeMap.put("svgz", "image/svg+xml-compressed");
		mimeTypeMap.put("swf", "application/x-shockwave-flash");
		mimeTypeMap.put("sxc", "application/vnd.sun.xml.calc");
		mimeTypeMap.put("sxd", "application/vnd.sun.xml.draw");
		mimeTypeMap.put("sxg", "application/vnd.sun.xml.writer.global");
		mimeTypeMap.put("sxi", "application/vnd.sun.xml.impress");
		mimeTypeMap.put("sxm", "application/vnd.sun.xml.math");
		mimeTypeMap.put("sxw", "application/vnd.sun.xml.writer");
		mimeTypeMap.put("sylk", "text/spreadsheet");
		mimeTypeMap.put("t", "text/troff");
		mimeTypeMap.put("t2t", "text/x-txt2tags");
		mimeTypeMap.put("tar", "application/x-tar");
		mimeTypeMap.put("tar.bz", "application/x-bzip-compressed-tar");
		mimeTypeMap.put("tar.bz2", "application/x-bzip-compressed-tar");
		mimeTypeMap.put("tar.gz", "application/x-compressed-tar");
		mimeTypeMap.put("tar.lzma", "application/x-lzma-compressed-tar");
		mimeTypeMap.put("tar.lzo", "application/x-tzo");
		mimeTypeMap.put("tar.xz", "application/x-xz-compressed-tar");
		mimeTypeMap.put("tar.z", "application/x-tarz");
		mimeTypeMap.put("tbz", "application/x-bzip-compressed-tar");
		mimeTypeMap.put("tbz2", "application/x-bzip-compressed-tar");
		mimeTypeMap.put("tcl", "text/x-tcl");
		mimeTypeMap.put("tex", "text/x-tex");
		mimeTypeMap.put("texi", "text/x-texinfo");
		mimeTypeMap.put("texinfo", "text/x-texinfo");
		mimeTypeMap.put("tga", "image/x-tga");
		mimeTypeMap.put("tgz", "application/x-compressed-tar");
		mimeTypeMap.put("theme", "application/x-theme");
		mimeTypeMap.put("themepack", "application/x-windows-themepack");
		mimeTypeMap.put("tif", "image/tiff");
		mimeTypeMap.put("tiff", "image/tiff");
		mimeTypeMap.put("tk", "text/x-tcl");
		mimeTypeMap.put("tlz", "application/x-lzma-compressed-tar");
		mimeTypeMap.put("tnef", "application/vnd.ms-tnef");
		mimeTypeMap.put("tnf", "application/vnd.ms-tnef");
		mimeTypeMap.put("toc", "application/x-cdrdao-toc");
		mimeTypeMap.put("torrent", "application/x-bittorrent");
		mimeTypeMap.put("tpic", "image/x-tga");
		mimeTypeMap.put("tr", "text/troff");
		mimeTypeMap.put("ts", "application/x-linguist");
		mimeTypeMap.put("tsv", "text/tab-separated-values");
		mimeTypeMap.put("tta", "audio/x-tta");
		mimeTypeMap.put("ttc", "application/x-font-ttf");
		mimeTypeMap.put("ttf", "application/x-font-ttf");
		mimeTypeMap.put("ttx", "application/x-font-ttx");
		mimeTypeMap.put("txt", "text/plain");
		mimeTypeMap.put("txz", "application/x-xz-compressed-tar");
		mimeTypeMap.put("tzo", "application/x-tzo");
		mimeTypeMap.put("ufraw", "application/x-ufraw");
		mimeTypeMap.put("ui", "application/x-designer");
		mimeTypeMap.put("uil", "text/x-uil");
		mimeTypeMap.put("ult", "audio/x-mod");
		mimeTypeMap.put("uni", "audio/x-mod");
		mimeTypeMap.put("uri", "text/x-uri");
		mimeTypeMap.put("url", "text/x-uri");
		mimeTypeMap.put("ustar", "application/x-ustar");
		mimeTypeMap.put("vala", "text/x-vala");
		mimeTypeMap.put("vapi", "text/x-vala");
		mimeTypeMap.put("vcf", "text/directory");
		mimeTypeMap.put("vcs", "text/calendar");
		mimeTypeMap.put("vct", "text/directory");
		mimeTypeMap.put("vda", "image/x-tga");
		mimeTypeMap.put("vhd", "text/x-vhdl");
		mimeTypeMap.put("vhdl", "text/x-vhdl");
		mimeTypeMap.put("viv", "video/vivo");
		mimeTypeMap.put("vivo", "video/vivo");
		mimeTypeMap.put("vlc", "audio/x-mpegurl");
		mimeTypeMap.put("vob", "video/mpeg");
		mimeTypeMap.put("voc", "audio/x-voc");
		mimeTypeMap.put("vor", "application/vnd.stardivision.writer");
		mimeTypeMap.put("vst", "image/x-tga");
		mimeTypeMap.put("wav", "audio/x-wav");
		mimeTypeMap.put("wax", "audio/x-ms-asx");
		mimeTypeMap.put("wb1", "application/x-quattropro");
		mimeTypeMap.put("wb2", "application/x-quattropro");
		mimeTypeMap.put("wb3", "application/x-quattropro");
		mimeTypeMap.put("wbmp", "image/vnd.wap.wbmp");
		mimeTypeMap.put("wcm", "application/vnd.ms-works");
		mimeTypeMap.put("wdb", "application/vnd.ms-works");
		mimeTypeMap.put("webm", "video/webm");
		mimeTypeMap.put("wk1", "application/vnd.lotus-1-2-3");
		mimeTypeMap.put("wk3", "application/vnd.lotus-1-2-3");
		mimeTypeMap.put("wk4", "application/vnd.lotus-1-2-3");
		mimeTypeMap.put("wks", "application/vnd.ms-works");
		mimeTypeMap.put("wma", "audio/x-ms-wma");
		mimeTypeMap.put("wmf", "image/x-wmf");
		mimeTypeMap.put("wml", "text/vnd.wap.wml");
		mimeTypeMap.put("wmls", "text/vnd.wap.wmlscript");
		mimeTypeMap.put("wmv", "video/x-ms-wmv");
		mimeTypeMap.put("wmx", "audio/x-ms-asx");
		mimeTypeMap.put("wp", "application/vnd.wordperfect");
		mimeTypeMap.put("wp4", "application/vnd.wordperfect");
		mimeTypeMap.put("wp5", "application/vnd.wordperfect");
		mimeTypeMap.put("wp6", "application/vnd.wordperfect");
		mimeTypeMap.put("wpd", "application/vnd.wordperfect");
		mimeTypeMap.put("wpg", "application/x-wpg");
		mimeTypeMap.put("wpl", "application/vnd.ms-wpl");
		mimeTypeMap.put("wpp", "application/vnd.wordperfect");
		mimeTypeMap.put("wps", "application/vnd.ms-works");
		mimeTypeMap.put("wri", "application/x-mswrite");
		mimeTypeMap.put("wrl", "model/vrml");
		mimeTypeMap.put("wv", "audio/x-wavpack");
		mimeTypeMap.put("wvc", "audio/x-wavpack-correction");
		mimeTypeMap.put("wvp", "audio/x-wavpack");
		mimeTypeMap.put("wvx", "audio/x-ms-asx");
		mimeTypeMap.put("x3f", "image/x-sigma-x3f");
		mimeTypeMap.put("xac", "application/x-gnucash");
		mimeTypeMap.put("xbel", "application/x-xbel");
		mimeTypeMap.put("xbl", "application/xml");
		mimeTypeMap.put("xbm", "image/x-xbitmap");
		mimeTypeMap.put("xcf", "image/x-xcf");
		mimeTypeMap.put("xcf.bz2", "image/x-compressed-xcf");
		mimeTypeMap.put("xcf.gz", "image/x-compressed-xcf");
		mimeTypeMap.put("xhtml", "application/xhtml+xml");
		mimeTypeMap.put("xi", "audio/x-xi");
		mimeTypeMap.put("xla", "application/vnd.ms-excel");
		mimeTypeMap.put("xlc", "application/vnd.ms-excel");
		mimeTypeMap.put("xld", "application/vnd.ms-excel");
		mimeTypeMap.put("xlf", "application/x-xliff");
		mimeTypeMap.put("xliff", "application/x-xliff");
		mimeTypeMap.put("xll", "application/vnd.ms-excel");
		mimeTypeMap.put("xlm", "application/vnd.ms-excel");
		mimeTypeMap.put("xls", "application/vnd.ms-excel");
		mimeTypeMap.put("xlsm", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
		mimeTypeMap.put("xlsx", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
		mimeTypeMap.put("xlt", "application/vnd.ms-excel");
		mimeTypeMap.put("xlw", "application/vnd.ms-excel");
		mimeTypeMap.put("xm", "audio/x-xm");
		mimeTypeMap.put("xmf", "audio/x-xmf");
		mimeTypeMap.put("xmi", "text/x-xmi");
		mimeTypeMap.put("xml", "application/xml");
		mimeTypeMap.put("xpm", "image/x-xpixmap");
		mimeTypeMap.put("xps", "application/vnd.ms-xpsdocument");
		mimeTypeMap.put("xsl", "application/xml");
		mimeTypeMap.put("xslfo", "text/x-xslfo");
		mimeTypeMap.put("xslt", "application/xml");
		mimeTypeMap.put("xspf", "application/xspf+xml");
		mimeTypeMap.put("xul", "application/vnd.mozilla.xul+xml");
		mimeTypeMap.put("xwd", "image/x-xwindowdump");
		mimeTypeMap.put("xyz", "chemical/x-pdb");
		mimeTypeMap.put("xz", "application/x-xz");
		mimeTypeMap.put("w2p", "application/w2p");
		mimeTypeMap.put("z", "application/x-compress");
		mimeTypeMap.put("zabw", "application/x-abiword");
		mimeTypeMap.put("zip", "application/zip");
		mimeTypeMap.put("zoo", "application/x-zoo");
	}
}