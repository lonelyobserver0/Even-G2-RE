package no.nordicsemi.android.dfu;

import android.content.Context;
import android.content.Intent;
import com.stub.StubApp;
import l0.C1137b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DfuServiceController implements DfuController {
    private boolean mAborted;
    private final C1137b mBroadcastManager;
    private boolean mPaused;

    public DfuServiceController(Context context) {
        this.mBroadcastManager = C1137b.a(context);
    }

    @Override // no.nordicsemi.android.dfu.DfuController
    public void abort() {
        if (this.mAborted) {
            return;
        }
        this.mAborted = true;
        this.mPaused = false;
        Intent intent = new Intent(StubApp.getString2(26411));
        intent.putExtra(StubApp.getString2(26389), 2);
        this.mBroadcastManager.c(intent);
    }

    public boolean isAborted() {
        return this.mAborted;
    }

    public boolean isPaused() {
        return this.mPaused;
    }

    @Override // no.nordicsemi.android.dfu.DfuController
    public void pause() {
        if (this.mAborted || this.mPaused) {
            return;
        }
        this.mPaused = true;
        Intent intent = new Intent(StubApp.getString2(26411));
        intent.putExtra(StubApp.getString2(26389), 0);
        this.mBroadcastManager.c(intent);
    }

    @Override // no.nordicsemi.android.dfu.DfuController
    public void resume() {
        if (this.mAborted || !this.mPaused) {
            return;
        }
        this.mPaused = false;
        Intent intent = new Intent(StubApp.getString2(26411));
        intent.putExtra(StubApp.getString2(26389), 1);
        this.mBroadcastManager.c(intent);
    }
}
