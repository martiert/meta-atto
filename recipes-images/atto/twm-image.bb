require systemd-image.bb

IMAGE_INSTALL += "\
    twm \
    xterm \
    xclock \
    xrdb \
    xrandr \
    xinit \
    ${XSERVER} \
"

export IMAGE_BASENAME = "twm-image"
