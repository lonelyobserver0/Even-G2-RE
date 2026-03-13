"""
Even G2 dashboard experiment server.

This server exposes a small HTTP API for the confirmed AA 12 transport:
scan, connect, disconnect, and send a serviceId=8 cmdId=7/cmdId=8 BMP test.
"""

import asyncio
import threading
import time

from bleak import BleakClient, BleakScanner
from flask import Flask, jsonify, request
from flask_cors import CORS

from send_image_real import (
    NOTIFY_UUID,
    find_left,
    notification_handler,
    send_dashboard_image,
)


class G2:
    def __init__(self) -> None:
        self.client = None
        self.address = None
        self.connected = False
        self.log = []

    def _log(self, message: str) -> None:
        print(message)
        self.log.append(message)

    async def scan(self):
        self._log("Scanning...")
        result = await BleakScanner.discover(timeout=8, return_adv=True)
        devices = []
        for address, (device, adv) in result.items():
            name = device.name or ""
            if "even" in name.lower() or "g2" in name.lower() or "r1" in name.lower():
                devices.append({
                    "name": name,
                    "address": address,
                    "rssi": adv.rssi,
                })
        return devices

    async def connect(self, address: str | None = None):
        target = address or await find_left()
        if not target:
            raise RuntimeError("No Even G2 left lens found")

        self._log(f"Connecting to {target}...")
        self.client = BleakClient(target)
        await self.client.connect()
        await self.client.start_notify(NOTIFY_UUID, notification_handler)
        self.address = target
        self.connected = True
        self._log("Connected")

    async def disconnect(self):
        if self.client:
            try:
                await self.client.stop_notify(NOTIFY_UUID)
            except Exception:
                pass
            await self.client.disconnect()
        self.client = None
        self.address = None
        self.connected = False
        self._log("Disconnected")

    async def send_dashboard_experiment(
        self,
        image_path: str,
        *,
        header_byte2: int,
        image_field_number: int,
        chunk_size: int,
    ):
        if not self.client or not self.client.is_connected:
            raise RuntimeError("Connect first")

        self._log(
            "Sending dashboard experiment "
            f"(field={image_field_number}, byte2=0x{header_byte2:02X}, chunk={chunk_size})"
        )
        await send_dashboard_image(
            self.client,
            image_path,
            header_byte2=header_byte2,
            image_field_number=image_field_number,
            chunk_size=chunk_size,
        )
        self._log("Experiment sent")


g2 = G2()
ble_loop = None


def run_ble_loop():
    global ble_loop
    ble_loop = asyncio.new_event_loop()
    asyncio.set_event_loop(ble_loop)
    ble_loop.run_forever()


def run_async(coro):
    return asyncio.run_coroutine_threadsafe(coro, ble_loop).result(timeout=120)


app = Flask(__name__)
CORS(app)


@app.route("/api/status")
def api_status():
    return jsonify({"connected": g2.connected, "address": g2.address})


@app.route("/api/scan", methods=["POST"])
def api_scan():
    try:
        return jsonify({"devices": run_async(g2.scan())})
    except Exception as exc:
        return jsonify({"error": str(exc)}), 500


@app.route("/api/connect", methods=["POST"])
def api_connect():
    data = request.json or {}
    address = data.get("address")
    try:
        run_async(g2.connect(address))
        return jsonify({"connected": True, "address": g2.address})
    except Exception as exc:
        return jsonify({"error": str(exc)}), 500


@app.route("/api/disconnect", methods=["POST"])
def api_disconnect():
    try:
        run_async(g2.disconnect())
        return jsonify({"connected": False})
    except Exception as exc:
        return jsonify({"error": str(exc)}), 500


@app.route("/api/dashboard-experiment", methods=["POST"])
def api_dashboard_experiment():
    if not g2.connected:
        return jsonify({"error": "Connect first"}), 400

    data = request.json or {}
    image_path = data.get("image")
    if not image_path:
        return jsonify({"error": "image is required"}), 400

    try:
        run_async(
            g2.send_dashboard_experiment(
                image_path,
                header_byte2=int(data.get("header_byte2", 0)),
                image_field_number=int(data.get("image_field_number", 3)),
                chunk_size=int(data.get("chunk_size", 180)),
            )
        )
        return jsonify({"success": True, "log": g2.log[-20:]})
    except Exception as exc:
        return jsonify({"error": str(exc)}), 500


if __name__ == "__main__":
    print("=" * 50)
    print("  Even G2 Dashboard Experiment Server")
    print("=" * 50)
    thread = threading.Thread(target=run_ble_loop, daemon=True)
    thread.start()
    time.sleep(0.5)
    print("http://localhost:5000")
    print("  POST /api/scan")
    print("  POST /api/connect")
    print("  POST /api/disconnect")
    print("  POST /api/dashboard-experiment")
    print()
    app.run(host="0.0.0.0", port=5000, debug=False)
