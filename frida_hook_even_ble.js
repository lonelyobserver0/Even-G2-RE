'use strict';

function hex(bytes) {
  if (!bytes) {
    return '';
  }
  var out = [];
  for (var i = 0; i < bytes.length; i++) {
    var v = bytes[i];
    if (v < 0) {
      v += 256;
    }
    out.push(('0' + v.toString(16)).slice(-2));
  }
  return out.join(' ');
}

function safe(fn, fallback) {
  try {
    return fn();
  } catch (_) {
    return fallback;
  }
}

Java.perform(function () {
  var BluetoothGatt = Java.use('android.bluetooth.BluetoothGatt');
  var MethodCall = null;
  var FlutterEzwBlePlugin = null;
  var BleMC = null;
  var BleManager = null;
  var BleDevice = null;

  try {
    BleDevice = Java.use('com.fzfstudio.ezw_ble.ble.models.BleDevice');
  } catch (_) {
    BleDevice = null;
  }

  try {
    FlutterEzwBlePlugin = Java.use('com.fzfstudio.ezw_ble.FlutterEzwBlePlugin');
  } catch (_) {
    FlutterEzwBlePlugin = null;
  }

  try {
    BleMC = Java.use('com.fzfstudio.ezw_ble.ble.BleMC');
  } catch (_) {
    BleMC = null;
  }

  try {
    BleManager = Java.use('com.fzfstudio.ezw_ble.ble.BleManager');
  } catch (_) {
    BleManager = null;
  }

  try {
    MethodCall = Java.use('io.flutter.plugin.common.MethodCall');
  } catch (_) {
    MethodCall = null;
  }

  function printBlock(lines) {
    console.log(lines.join('\n'));
    console.log('---');
  }

  function formatArg(value) {
    if (value === null || value === undefined) {
      return 'null';
    }
    try {
      if (value.$className === '[B') {
        return hex(Java.array('byte', value));
      }
    } catch (_) {
    }
    try {
      return value.toString();
    } catch (_) {
      return '<unprintable>';
    }
  }

  if (FlutterEzwBlePlugin) {
    FlutterEzwBlePlugin.onMethodCall.overload(
      'io.flutter.plugin.common.MethodCall',
      'io.flutter.plugin.common.MethodChannel$Result'
    ).implementation = function (call, result) {
      var method = safe(function () { return call.method.value; }, '<?>');
      var args = safe(function () { return formatArg(call.arguments.value); }, '<args-error>');
      printBlock([
        '[FlutterEzwBlePlugin.onMethodCall]',
        'method=' + method,
        'arguments=' + args,
      ]);
      return this.onMethodCall(call, result);
    };
  }

  if (BleMC) {
    BleMC.handle.overload(
      'android.content.Context',
      'java.lang.Object',
      'io.flutter.plugin.common.MethodChannel$Result'
    ).implementation = function (context, argumentsObj, result) {
      var name = safe(function () { return this.toString(); }.bind(this), '<?>');
      printBlock([
        '[BleMC.handle]',
        'enum=' + name,
        'arguments=' + formatArg(argumentsObj),
      ]);
      return this.handle(context, argumentsObj, result);
    };
  }

  if (BleManager) {
    BleManager.startScan.overload('boolean').implementation = function (pureMode) {
      printBlock([
        '[BleManager.startScan]',
        'pureMode=' + pureMode,
      ]);
      return this.startScan(pureMode);
    };

    BleManager.connect.overload(
      'java.lang.String',
      'java.lang.String',
      'java.lang.String',
      'java.lang.String',
      'boolean',
      'boolean',
      'boolean'
    ).implementation = function (belongConfig, uuid, name, sn, isWaitingDevice, afterUpgrade, retryWhenNoFoundDevice) {
      printBlock([
        '[BleManager.connect]',
        'belongConfig=' + belongConfig,
        'uuid=' + uuid,
        'name=' + name,
        'sn=' + sn,
        'isWaitingDevice=' + isWaitingDevice,
        'afterUpgrade=' + afterUpgrade,
        'retryWhenNoFoundDevice=' + retryWhenNoFoundDevice,
      ]);
      return this.connect(belongConfig, uuid, name, sn, isWaitingDevice, afterUpgrade, retryWhenNoFoundDevice);
    };

    BleManager.disconnect.overload('java.lang.String', 'boolean').implementation = function (uuid, removeBond) {
      printBlock([
        '[BleManager.disconnect]',
        'uuid=' + uuid,
        'removeBond=' + removeBond,
      ]);
      return this.disconnect(uuid, removeBond);
    };

    BleManager.sendCmd.overload('java.lang.String', '[B', 'int').implementation = function (uuid, data, psType) {
      var payload = Java.array('byte', data);
      printBlock([
        '[BleManager.sendCmd]',
        'uuid=' + uuid,
        'psType=' + psType,
        'len=' + payload.length,
        'data=' + hex(payload),
      ]);
      return this.sendCmd(uuid, data, psType);
    };

    BleManager.sendCmdNoWait.overload('java.lang.String', '[B', 'int').implementation = function (uuid, data, psType) {
      var payload = Java.array('byte', data);
      printBlock([
        '[BleManager.sendCmdNoWait]',
        'uuid=' + uuid,
        'psType=' + psType,
        'len=' + payload.length,
        'data=' + hex(payload),
      ]);
      return this.sendCmdNoWait(uuid, data, psType);
    };
  }

  if (BleDevice) {
    BleDevice.writeCharacteristic.overload('[B', 'int').implementation = function (data, psType) {
      var self = this;
      var addr = safe(function () { return self.getUuid(); }, '<?>');
      var name = safe(function () { return self.getName(); }, '<?>');
      var payload = Java.array('byte', data);
      printBlock([
        '[BleDevice.writeCharacteristic]',
        'device=' + addr,
        'name=' + name,
        'psType=' + psType,
        'len=' + (payload ? payload.length : -1),
        'data=' + hex(payload),
      ]);
      return this.writeCharacteristic(data, psType);
    };
  }

  if (BluetoothGatt.writeCharacteristic.overloads.length) {
    BluetoothGatt.writeCharacteristic.overloads.forEach(function (ov) {
      if (ov.argumentTypes.length === 3 &&
          ov.argumentTypes[0].className === 'android.bluetooth.BluetoothGattCharacteristic' &&
          ov.argumentTypes[1].className === '[B' &&
          ov.argumentTypes[2].className === 'int') {
        ov.implementation = function (ch, data, writeType) {
          var uuid = safe(function () { return ch.getUuid().toString(); }, '<?>');
          var instanceId = safe(function () { return ch.getInstanceId(); }, -1);
          var props = safe(function () { return ch.getProperties(); }, -1);
          var serviceUuid = safe(function () { return ch.getService().getUuid().toString(); }, '<?>');
          var payload = Java.array('byte', data);
          printBlock([
            '[BluetoothGatt.writeCharacteristic]',
            'service=' + serviceUuid,
            'char=' + uuid,
            'instanceId=' + instanceId,
            'props=' + props,
            'writeType=' + writeType,
            'len=' + (payload ? payload.length : -1),
            'data=' + hex(payload),
          ]);
          return ov.call(this, ch, data, writeType);
        };
      }
    });
  }

  var BluetoothGattCallback = Java.use('android.bluetooth.BluetoothGattCallback');
  BluetoothGattCallback.onCharacteristicChanged.overloads.forEach(function (ov) {
    if (ov.argumentTypes.length >= 2 &&
        ov.argumentTypes[1].className === 'android.bluetooth.BluetoothGattCharacteristic') {
      ov.implementation = function () {
        var ch = arguments[1];
        var uuid = safe(function () { return ch.getUuid().toString(); }, '<?>');
        var instanceId = safe(function () { return ch.getInstanceId(); }, -1);
        var value = safe(function () { return Java.array('byte', ch.getValue()); }, null);
        printBlock([
          '[BluetoothGattCallback.onCharacteristicChanged]',
          'char=' + uuid,
          'instanceId=' + instanceId,
          'len=' + (value ? value.length : -1),
          'data=' + hex(value),
        ]);
        return ov.apply(this, arguments);
      };
    }
  });

  console.log('Frida BLE hooks installed');
});
