DDESCRIPTION = "Atto theme for exquisite"
HOMEPAGE = "http://www.enlightenment.org"
LICENSE = "BSD"
SECTION = "x11"

DEPENDS = "edje-native"
RRECOMMENDS_${PN} = "exquisite"

PR = "r1"
PV = "1.2"

inherit update-alternatives

ALTERNATIVE_NAME = "exquisite-config"
ALTERNATIVE_LINK = "${sysconfdir}/exquisite/config"
ALTERNATIVE_PATH = "${sysconfdir}/exquisite/config-atto"
ALTERNATIVE_PRIORITY = "20"

SRC_URI = "file://atto/"

S = "${WORKDIR}/atto"

do_compile() {
   edje_cc exquisite-ang.edc atto.edj
}

do_install() {
    install -d ${D}${sysconfdir}/exquisite
    install -d ${D}${datadir}/exquisite/data/themes
    install -m 0644 ${S}/atto.edj ${D}${datadir}/exquisite/data/themes/
    echo 'THEME="-t atto"' > ${D}${sysconfdir}/exquisite/config-atto
}

PACKAGE_ARCH = "all"
CONFFILES_${PN} = "${sysconfdir}/exquisite/config-atto"
FILES_${PN} = "${sysconfdir}/exquisite ${datadir}/exquisite/data/themes"
