package q4;

import android.app.Activity;
import com.stub.StubApp;
import java.util.concurrent.Executor;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class j {
    public j addOnCanceledListener(Activity activity, InterfaceC1522c interfaceC1522c) {
        throw new UnsupportedOperationException(StubApp.getString2(22217));
    }

    public j addOnCompleteListener(Activity activity, d dVar) {
        throw new UnsupportedOperationException(StubApp.getString2(22219));
    }

    public abstract j addOnFailureListener(Executor executor, e eVar);

    public abstract j addOnFailureListener(e eVar);

    public abstract j addOnSuccessListener(Executor executor, f fVar);

    public abstract j addOnSuccessListener(f fVar);

    public <TContinuationResult> j continueWith(InterfaceC1521b interfaceC1521b) {
        throw new UnsupportedOperationException(StubApp.getString2(22220));
    }

    public <TContinuationResult> j continueWithTask(InterfaceC1521b interfaceC1521b) {
        throw new UnsupportedOperationException(StubApp.getString2(22221));
    }

    public abstract Exception getException();

    public abstract Object getResult();

    public abstract Object getResult(Class cls);

    public abstract boolean isCanceled();

    public abstract boolean isComplete();

    public abstract boolean isSuccessful();

    public <TContinuationResult> j onSuccessTask(i iVar) {
        throw new UnsupportedOperationException(StubApp.getString2(22222));
    }

    public j addOnCanceledListener(Executor executor, InterfaceC1522c interfaceC1522c) {
        throw new UnsupportedOperationException(StubApp.getString2(22218));
    }

    public j addOnCompleteListener(d dVar) {
        throw new UnsupportedOperationException(StubApp.getString2(22219));
    }

    public <TContinuationResult> j continueWith(Executor executor, InterfaceC1521b interfaceC1521b) {
        throw new UnsupportedOperationException(StubApp.getString2(22220));
    }

    public <TContinuationResult> j continueWithTask(Executor executor, InterfaceC1521b interfaceC1521b) {
        throw new UnsupportedOperationException(StubApp.getString2(22221));
    }

    public <TContinuationResult> j onSuccessTask(Executor executor, i iVar) {
        throw new UnsupportedOperationException(StubApp.getString2(22222));
    }

    public j addOnCompleteListener(Executor executor, d dVar) {
        throw new UnsupportedOperationException(StubApp.getString2(22219));
    }
}
