INHERIT += "package_ipk"

ATTO_FEED_CONFIGS ?= "atto-feed-configs"

EXTRAOPKGCONFIG = "opkg-config-base ${ATTO_FEED_CONFIGS}"

ATTO_IPK_UPDATE_ALTERNATIVES ?= "opkg"

DISTRO_UPDATE_ALTERNATIVES = "${ATTO_IPK_UPDATE_ALTERNATIVES}"

# we need the same provider for opkg and u-a
PREFERRED_PROVIDER_virtual/update-alternatives-native ?= "opkg-native"
PREFERRED_PROVIDER_virtual/update-alternatives = "${ATTO_IPK_UPDATE_ALTERNATIVES}"
VIRTUAL-RUNTIME_update-alternatives = "${ATTO_IPK_UPDATE_ALTERNATIVES}"

