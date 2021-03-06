DESCRIPTION = "Task packages for the Atto distribution"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58"

PR = "r33"

inherit packagegroup

RDEPENDS_${PN} = "\
    nmap \
    ettercap-ng \
    stunnel \
    curl \
    prismstumbler \
    kismet \
    hydra \
    miniclipboard"
