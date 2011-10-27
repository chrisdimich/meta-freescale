PR = "r3"

require recipes-core/meta/meta-toolchain.bb

TOOLCHAIN_OUTPUTNAME = "${SDK_NAME}-toolchain-bare-${DISTRO_VERSION}"
TOOLCHAIN_TARGET_TASK = "task-core-standalone-sdk-target"
TOOLCHAIN_HOST_TASK = "task-cross-canadian-${TRANSLATED_TARGET_ARCH}"
TOOLCHAIN_NEED_CONFIGSITE_CACHE += "zlib"
