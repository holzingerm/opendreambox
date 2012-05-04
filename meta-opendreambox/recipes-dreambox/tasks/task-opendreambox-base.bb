SUMMARY = "OpenDreambox: Base Task for the OpenDreambox Distribution"
SECTION = "opendreambox/base"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${OPENDREAMBOX_BASE}/LICENSE;md5=0a5ec7423edaca24547634f416478834"
PR = "r15"

inherit task

#
# task-opendreambox-base
#
SUMMARY_${PN} = "OpenDreambox: Basesystem utilities"

RDEPENDS_${PN} = " \
  distro-feed-configs \
  dreambox-bootlogo \
  fakelocale \
  killall \
  openresolv \
  opkg \
  procps \
  tpmd \
  tuxbox-common \
  tzdata \
"

RRECOMMENDS_${PN} = " \
  autofs \
  avahi-daemon \
  base-files-doc \
  dccamd \
  dreambox-compat \
  dropbear \
  e2fsprogs-e2fsck \
  e2fsprogs-mke2fs \
  gdbserver \
  hddtemp \
  hdparm \
  joe \
  libpagecache \
  mc \
  ncdu \
  ppp \
  sambaserver \
  sdparm \
  smartmontools \
  util-linux-blkid \
  util-linux-sfdisk \
  vsftpd \
  zeroconf \
"
