package Kc;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* renamed from: Kc.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C0096c extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        C0099f b2;
        while (true) {
            try {
                reentrantLock = C0099f.f3804h;
                reentrantLock.lock();
                try {
                    b2 = AbstractC0095b.b();
                } finally {
                    reentrantLock.unlock();
                }
            } catch (InterruptedException unused) {
            }
            if (b2 == C0099f.f3807l) {
                C0099f.f3807l = null;
                return;
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            if (b2 != null) {
                b2.k();
            }
        }
    }
}
