package no.nordicsemi.android.dfu;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.internal.measurement.L1;
import com.stub.StubApp;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import l0.C1137b;
import no.nordicsemi.android.dfu.internal.scanner.BootloaderScannerFactory;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DfuServiceListenerHelper {
    private static LogBroadcastReceiver mLogBroadcastReceiver;
    private static ProgressBroadcastsReceiver mProgressBroadcastReceiver;

    public static class LogBroadcastReceiver extends BroadcastReceiver {
        private DfuLogListener mGlobalLogListener;
        private final Map<String, DfuLogListener> mListeners;

        public /* synthetic */ LogBroadcastReceiver(int i3) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean removeLogListener(DfuLogListener dfuLogListener) {
            if (this.mGlobalLogListener == dfuLogListener) {
                this.mGlobalLogListener = null;
            }
            Iterator<Map.Entry<String, DfuLogListener>> it = this.mListeners.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, DfuLogListener> next = it.next();
                if (next.getValue() == dfuLogListener) {
                    this.mListeners.remove(next.getKey());
                    break;
                }
            }
            Iterator<Map.Entry<String, DfuLogListener>> it2 = this.mListeners.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry<String, DfuLogListener> next2 = it2.next();
                if (next2.getValue() == dfuLogListener) {
                    this.mListeners.remove(next2.getKey());
                    break;
                }
            }
            return this.mGlobalLogListener == null && this.mListeners.isEmpty();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLogListener(DfuLogListener dfuLogListener) {
            this.mGlobalLogListener = dfuLogListener;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String stringExtra = intent.getStringExtra(StubApp.getString2(26362));
            DfuLogListener dfuLogListener = this.mGlobalLogListener;
            DfuLogListener dfuLogListener2 = this.mListeners.get(stringExtra);
            if (dfuLogListener == null && dfuLogListener2 == null) {
                return;
            }
            int intExtra = intent.getIntExtra(StubApp.getString2(26488), 0);
            String stringExtra2 = intent.getStringExtra(StubApp.getString2(26487));
            if (dfuLogListener != null) {
                dfuLogListener.onLogEvent(stringExtra, intExtra, stringExtra2);
            }
            if (dfuLogListener2 != null) {
                dfuLogListener2.onLogEvent(stringExtra, intExtra, stringExtra2);
            }
        }

        private LogBroadcastReceiver() {
            this.mListeners = new HashMap();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLogListener(String str, DfuLogListener dfuLogListener) {
            this.mListeners.put(str, dfuLogListener);
            this.mListeners.put(BootloaderScannerFactory.getIncrementedAddress(str), dfuLogListener);
        }
    }

    public static class ProgressBroadcastsReceiver extends BroadcastReceiver {
        private DfuProgressListener mGlobalProgressListener;
        private final Map<String, DfuProgressListener> mListeners;

        public /* synthetic */ ProgressBroadcastsReceiver(int i3) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean removeProgressListener(DfuProgressListener dfuProgressListener) {
            if (this.mGlobalProgressListener == dfuProgressListener) {
                this.mGlobalProgressListener = null;
            }
            Iterator<Map.Entry<String, DfuProgressListener>> it = this.mListeners.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, DfuProgressListener> next = it.next();
                if (next.getValue() == dfuProgressListener) {
                    this.mListeners.remove(next.getKey());
                    break;
                }
            }
            Iterator<Map.Entry<String, DfuProgressListener>> it2 = this.mListeners.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry<String, DfuProgressListener> next2 = it2.next();
                if (next2.getValue() == dfuProgressListener) {
                    this.mListeners.remove(next2.getKey());
                    break;
                }
            }
            return this.mGlobalProgressListener == null && this.mListeners.isEmpty();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProgressListener(DfuProgressListener dfuProgressListener) {
            this.mGlobalProgressListener = dfuProgressListener;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action;
            String stringExtra = intent.getStringExtra(StubApp.getString2(26362));
            if (stringExtra == null) {
                return;
            }
            DfuProgressListener dfuProgressListener = this.mGlobalProgressListener;
            DfuProgressListener dfuProgressListener2 = this.mListeners.get(stringExtra);
            if ((dfuProgressListener == null && dfuProgressListener2 == null) || (action = intent.getAction()) == null) {
                return;
            }
            String string2 = StubApp.getString2(26419);
            if (!action.equals(StubApp.getString2(26420))) {
                if (action.equals(StubApp.getString2(26417))) {
                    int intExtra = intent.getIntExtra(string2, 0);
                    int intExtra2 = intent.getIntExtra(StubApp.getString2(26418), 0);
                    if (dfuProgressListener != null) {
                        dfuProgressListener.onDeviceDisconnected(stringExtra);
                    }
                    if (dfuProgressListener2 != null) {
                        dfuProgressListener2.onDeviceDisconnected(stringExtra);
                    }
                    if (intExtra2 == 1) {
                        if (dfuProgressListener != null) {
                            dfuProgressListener.onError(stringExtra, intExtra, intExtra2, L1.A(intExtra));
                        }
                        if (dfuProgressListener2 != null) {
                            dfuProgressListener2.onError(stringExtra, intExtra, intExtra2, L1.A(intExtra));
                            return;
                        }
                        return;
                    }
                    if (intExtra2 != 3) {
                        if (dfuProgressListener != null) {
                            dfuProgressListener.onError(stringExtra, intExtra, intExtra2, L1.z(intExtra));
                        }
                        if (dfuProgressListener2 != null) {
                            dfuProgressListener2.onError(stringExtra, intExtra, intExtra2, L1.z(intExtra));
                        }
                        return;
                    }
                    if (dfuProgressListener != null) {
                        dfuProgressListener.onError(stringExtra, intExtra, intExtra2, L1.B(intExtra));
                    }
                    if (dfuProgressListener2 != null) {
                        dfuProgressListener2.onError(stringExtra, intExtra, intExtra2, L1.B(intExtra));
                        return;
                    }
                    return;
                }
                return;
            }
            int intExtra3 = intent.getIntExtra(string2, 0);
            float floatExtra = intent.getFloatExtra(StubApp.getString2(26421), 0.0f);
            float floatExtra2 = intent.getFloatExtra(StubApp.getString2(26422), 0.0f);
            int intExtra4 = intent.getIntExtra(StubApp.getString2(26299), 0);
            int intExtra5 = intent.getIntExtra(StubApp.getString2(26300), 0);
            switch (intExtra3) {
                case DfuBaseService.PROGRESS_ABORTED /* -7 */:
                    if (dfuProgressListener != null) {
                        dfuProgressListener.onDeviceDisconnected(stringExtra);
                        dfuProgressListener.onDfuAborted(stringExtra);
                    }
                    if (dfuProgressListener2 != null) {
                        dfuProgressListener2.onDeviceDisconnected(stringExtra);
                        dfuProgressListener2.onDfuAborted(stringExtra);
                        break;
                    }
                    break;
                case DfuBaseService.PROGRESS_COMPLETED /* -6 */:
                    if (dfuProgressListener != null) {
                        dfuProgressListener.onDeviceDisconnected(stringExtra);
                        dfuProgressListener.onDfuCompleted(stringExtra);
                    }
                    if (dfuProgressListener2 != null) {
                        dfuProgressListener2.onDeviceDisconnected(stringExtra);
                        dfuProgressListener2.onDfuCompleted(stringExtra);
                        break;
                    }
                    break;
                case DfuBaseService.PROGRESS_DISCONNECTING /* -5 */:
                    if (dfuProgressListener != null) {
                        dfuProgressListener.onDeviceDisconnecting(stringExtra);
                    }
                    if (dfuProgressListener2 != null) {
                        dfuProgressListener2.onDeviceDisconnecting(stringExtra);
                        break;
                    }
                    break;
                case DfuBaseService.PROGRESS_VALIDATING /* -4 */:
                    if (dfuProgressListener != null) {
                        dfuProgressListener.onFirmwareValidating(stringExtra);
                    }
                    if (dfuProgressListener2 != null) {
                        dfuProgressListener2.onFirmwareValidating(stringExtra);
                        break;
                    }
                    break;
                case DfuBaseService.PROGRESS_ENABLING_DFU_MODE /* -3 */:
                    if (dfuProgressListener != null) {
                        dfuProgressListener.onEnablingDfuMode(stringExtra);
                    }
                    if (dfuProgressListener2 != null) {
                        dfuProgressListener2.onEnablingDfuMode(stringExtra);
                        break;
                    }
                    break;
                case DfuBaseService.PROGRESS_STARTING /* -2 */:
                    if (dfuProgressListener != null) {
                        dfuProgressListener.onDeviceConnected(stringExtra);
                        dfuProgressListener.onDfuProcessStarting(stringExtra);
                    }
                    if (dfuProgressListener2 != null) {
                        dfuProgressListener2.onDeviceConnected(stringExtra);
                        dfuProgressListener2.onDfuProcessStarting(stringExtra);
                        break;
                    }
                    break;
                case -1:
                    if (dfuProgressListener != null) {
                        dfuProgressListener.onDeviceConnecting(stringExtra);
                    }
                    if (dfuProgressListener2 != null) {
                        dfuProgressListener2.onDeviceConnecting(stringExtra);
                        break;
                    }
                    break;
                default:
                    if (intExtra3 == 0) {
                        if (dfuProgressListener != null) {
                            dfuProgressListener.onDfuProcessStarted(stringExtra);
                        }
                        if (dfuProgressListener2 != null) {
                            dfuProgressListener2.onDfuProcessStarted(stringExtra);
                        }
                    }
                    if (dfuProgressListener != null) {
                        dfuProgressListener.onProgressChanged(stringExtra, intExtra3, floatExtra, floatExtra2, intExtra4, intExtra5);
                    }
                    if (dfuProgressListener2 != null) {
                        dfuProgressListener2.onProgressChanged(stringExtra, intExtra3, floatExtra, floatExtra2, intExtra4, intExtra5);
                        break;
                    }
                    break;
            }
        }

        private ProgressBroadcastsReceiver() {
            this.mListeners = new HashMap();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProgressListener(String str, DfuProgressListener dfuProgressListener) {
            this.mListeners.put(str, dfuProgressListener);
            this.mListeners.put(BootloaderScannerFactory.getIncrementedAddress(str), dfuProgressListener);
        }
    }

    public static void registerLogListener(Context context, DfuLogListener dfuLogListener) {
        if (mLogBroadcastReceiver == null) {
            mLogBroadcastReceiver = new LogBroadcastReceiver(0);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(StubApp.getString2(26486));
            C1137b.a(context).b(mLogBroadcastReceiver, intentFilter);
        }
        mLogBroadcastReceiver.setLogListener(dfuLogListener);
    }

    public static void registerProgressListener(Context context, DfuProgressListener dfuProgressListener) {
        if (mProgressBroadcastReceiver == null) {
            mProgressBroadcastReceiver = new ProgressBroadcastsReceiver(0);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(StubApp.getString2(26420));
            intentFilter.addAction(StubApp.getString2(26417));
            C1137b.a(context).b(mProgressBroadcastReceiver, intentFilter);
        }
        mProgressBroadcastReceiver.setProgressListener(dfuProgressListener);
    }

    public static void unregisterLogListener(Context context, DfuLogListener dfuLogListener) {
        LogBroadcastReceiver logBroadcastReceiver = mLogBroadcastReceiver;
        if (logBroadcastReceiver == null || !logBroadcastReceiver.removeLogListener(dfuLogListener)) {
            return;
        }
        C1137b.a(context).d(mLogBroadcastReceiver);
        mLogBroadcastReceiver = null;
    }

    public static void unregisterProgressListener(Context context, DfuProgressListener dfuProgressListener) {
        ProgressBroadcastsReceiver progressBroadcastsReceiver = mProgressBroadcastReceiver;
        if (progressBroadcastsReceiver == null || !progressBroadcastsReceiver.removeProgressListener(dfuProgressListener)) {
            return;
        }
        C1137b.a(context).d(mProgressBroadcastReceiver);
        mProgressBroadcastReceiver = null;
    }

    public static void registerLogListener(Context context, DfuLogListener dfuLogListener, String str) {
        if (mLogBroadcastReceiver == null) {
            mLogBroadcastReceiver = new LogBroadcastReceiver(0);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(StubApp.getString2(26486));
            C1137b.a(context).b(mLogBroadcastReceiver, intentFilter);
        }
        mLogBroadcastReceiver.setLogListener(str, dfuLogListener);
    }

    public static void registerProgressListener(Context context, DfuProgressListener dfuProgressListener, String str) {
        if (mProgressBroadcastReceiver == null) {
            mProgressBroadcastReceiver = new ProgressBroadcastsReceiver(0);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(StubApp.getString2(26420));
            intentFilter.addAction(StubApp.getString2(26417));
            C1137b.a(context).b(mProgressBroadcastReceiver, intentFilter);
        }
        mProgressBroadcastReceiver.setProgressListener(str, dfuProgressListener);
    }
}
