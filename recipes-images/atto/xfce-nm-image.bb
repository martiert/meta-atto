require systemd-image.bb

CONMANPKGS = "networkmanager network-manager-applet"

IMAGE_INSTALL += " \
	packagegroup-xfce-base \
	packagegroup-gnome-xserver-base \
	packagegroup-core-x11-xserver \
	packagegroup-gnome-fonts \
	atto-gdm-autologin-hack atto-gdm-xfce-hack gdm gdm-systemd \
	atto-gnome-icon-theme-enable gtk-engine-clearlooks gtk-theme-clearlooks atto-clearlooks-theme-enable \
"

export IMAGE_BASENAME = "XFCE-NetworkManager-image"

