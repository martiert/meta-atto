require systemd-image.bb

IMAGE_INSTALL += "\
    xbmc \
"

export IMAGE_BASENAME = "xbmc-image"
