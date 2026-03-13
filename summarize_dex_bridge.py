from __future__ import annotations

from pathlib import Path
import re


ROOT = Path("/home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/jadx_output/sources/com/fzfstudio/ezw_ble")


def grep(path: Path, pattern: str) -> list[tuple[int, str]]:
    rx = re.compile(pattern)
    out: list[tuple[int, str]] = []
    for lineno, line in enumerate(path.read_text(errors="replace").splitlines(), start=1):
        if rx.search(line):
            out.append((lineno, line.strip()))
    return out


def main() -> None:
    targets = [
        ROOT / "FlutterEzwBlePlugin.java",
        ROOT / "ble/BleMC.java",
        ROOT / "ble/BleManager.java",
        ROOT / "ble/models/BleDevice.java",
        ROOT / "ble/models/BleConfig.java",
        ROOT / "ble/models/BlePrivateService.java",
    ]
    patterns = [
        r"onMethodCall|setMethodCallHandler|registerEventChannel",
        r"SEND_CMD|CONNECT_DEVICE|START_SCAN|STOP_SCAN",
        r"sendCmdNoWait|sendCmd\(|requestMtu|getMtu|checkIsFunctionCanBeCalled",
        r"writeCharacteristic\(|writeAndReadList|psType",
        r"15000\.0d|60000\.0d|247|getPrivateServices",
        r"getWriteCharsUUID|getReadCharsUUID|getServiceUUID|getType",
    ]
    for path in targets:
        print(f"\n== {path.name} ==")
        for pattern in patterns:
            matches = grep(path, pattern)
            if not matches:
                continue
            print(f"-- /{pattern}/")
            for lineno, line in matches[:12]:
                print(f"{lineno}: {line}")


if __name__ == "__main__":
    main()
