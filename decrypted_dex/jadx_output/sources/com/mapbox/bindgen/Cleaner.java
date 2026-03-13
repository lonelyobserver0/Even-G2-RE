package com.mapbox.bindgen;

import H3.a;
import com.stub.StubApp;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class Cleaner {
    private CleanerImpl impl = new CleanerImpl();

    public static class CleanerImpl implements Runnable {
        private ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        private Set<Finalizer> references = Collections.newSetFromMap(new ConcurrentHashMap());

        public void register(Object obj, Runnable runnable) {
            this.references.add(new Finalizer(obj, this.referenceQueue, runnable));
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!this.references.isEmpty()) {
                try {
                    Reference<? extends Object> remove = this.referenceQueue.remove(60000L);
                    if (remove != null) {
                        Finalizer finalizer = (Finalizer) remove;
                        finalizer.finalizeResources();
                        finalizer.clear();
                        this.references.remove(finalizer);
                    }
                } catch (InterruptedException unused) {
                }
            }
        }

        public void start() {
            Thread thread = new Thread(this);
            thread.setDaemon(true);
            thread.setPriority(8);
            thread.start();
        }
    }

    public static class Finalizer extends PhantomReference<Object> {
        Runnable cleanable;

        public Finalizer(Object obj, ReferenceQueue<? super Object> referenceQueue, Runnable runnable) {
            super(obj, referenceQueue);
            this.cleanable = runnable;
        }

        public void finalizeResources() {
            this.cleanable.run();
        }
    }

    private Cleaner() {
    }

    public static Cleaner create() {
        Cleaner cleaner = new Cleaner();
        cleaner.impl.register(cleaner, new a(1));
        cleaner.impl.start();
        return cleaner;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$create$0() {
    }

    public void register(Object obj, Runnable runnable) {
        Objects.requireNonNull(obj, StubApp.getString2(720));
        Objects.requireNonNull(runnable, StubApp.getString2(652));
        this.impl.register(obj, runnable);
    }
}
