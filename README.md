# NoMorePodzol

[Download on Modrinth](https://modrinth.com/project/nomorepodzol)

NoMorePodzol is a lightweight Fabric mod that prevents large spruce trees from generating podzol when grown.

The mod only disables podzol generation from trees, leaving naturally generated and existing podzol untouched.

## Installation

1. Install Minecraft 26.2 with Fabric Loader.
2. Install the compatible Fabric API version.
3. [Download NoMorePodzol from Modrinth](https://modrinth.com/project/nomorepodzol).
4. Place the NoMorePodzol JAR in your `mods` folder.
5. Launch Minecraft and start collecting!

### ⭐ Features
- Prevents large spruce trees from generating podzol.
- Configurable through the `nomorepodzol:disable_spruce_podzol` gamerule (enabled by default).
- Server-side only. Clients do not need to install the mod.
- No impact on normal tree growth or other ground blocks.

### Configuration

To allow normal podzol generation again, use:

`/gamerule nomorepodzol:disable_spruce_podzol false`

Set it to `true` to disable podzol generation again.

## Bug Reports & Suggestions

If you encounter a bug, please open an issue in the
[GitHub Issues](https://github.com/luuknijkmp/NoMorePodzol/issues) section.

When reporting a bug, please include:
- Your NoMorePodzol version
- Your Minecraft version
- Steps to reproduce the issue
- Relevant logs or screenshots, if available
