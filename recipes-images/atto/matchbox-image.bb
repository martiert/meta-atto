require systemd-image.bb

IMAGE_INSTALL += "\
    matchbox-wm \
    matchbox-session \
"

export IMAGE_BASENAME = "matchbox-image"
