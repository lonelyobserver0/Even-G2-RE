package no.nordicsemi.android.dfu;

import no.nordicsemi.android.dfu.DfuCallback;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class DfuServiceProvider implements DfuCallback {
    private boolean mAborted;
    private BaseDfuImpl mImpl;
    private boolean mPaused;

    @Override // no.nordicsemi.android.dfu.DfuController
    public void abort() {
        this.mAborted = true;
        BaseDfuImpl baseDfuImpl = this.mImpl;
        if (baseDfuImpl != null) {
            baseDfuImpl.abort();
        }
    }

    @Override // no.nordicsemi.android.dfu.DfuCallback
    public DfuCallback.DfuGattCallback getGattCallback() {
        BaseDfuImpl baseDfuImpl = this.mImpl;
        if (baseDfuImpl != null) {
            return baseDfuImpl.getGattCallback();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        if (r2.mAborted != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
    
        if (r2.mAborted != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
    
        if (r2.mAborted != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007b, code lost:
    
        if (r2.mAborted != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0099, code lost:
    
        if (r2.mAborted != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c4, code lost:
    
        if (r2.mAborted != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public no.nordicsemi.android.dfu.DfuService getServiceImpl(android.content.Intent r3, no.nordicsemi.android.dfu.DfuBaseService r4, android.bluetooth.BluetoothGatt r5) throws no.nordicsemi.android.dfu.internal.exception.DfuException, no.nordicsemi.android.dfu.internal.exception.DeviceDisconnectedException, no.nordicsemi.android.dfu.internal.exception.UploadAbortedException {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: no.nordicsemi.android.dfu.DfuServiceProvider.getServiceImpl(android.content.Intent, no.nordicsemi.android.dfu.DfuBaseService, android.bluetooth.BluetoothGatt):no.nordicsemi.android.dfu.DfuService");
    }

    @Override // no.nordicsemi.android.dfu.DfuCallback
    public void onBondStateChanged(int i3) {
        BaseDfuImpl baseDfuImpl = this.mImpl;
        if (baseDfuImpl != null) {
            baseDfuImpl.onBondStateChanged(i3);
        }
    }

    @Override // no.nordicsemi.android.dfu.DfuController
    public void pause() {
        this.mPaused = true;
    }

    @Override // no.nordicsemi.android.dfu.DfuController
    public void resume() {
        this.mPaused = false;
    }
}
