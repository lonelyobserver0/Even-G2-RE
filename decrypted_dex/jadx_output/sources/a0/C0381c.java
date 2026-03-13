package a0;

import R3.l;
import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import com.stub.StubApp;
import java.nio.ByteBuffer;

/* renamed from: a0.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0381c extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f9237a;

    /* renamed from: b, reason: collision with root package name */
    public final u5.d f9238b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0381c(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        u5.d dVar = new u5.d(24);
        this.f9237a = editText;
        this.f9238b = dVar;
        if (Y.h.f8658k != null) {
            Y.h a3 = Y.h.a();
            if (a3.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            l lVar = a3.f8663e;
            lVar.getClass();
            Bundle bundle = editorInfo.extras;
            Z.b bVar = (Z.b) ((p2.h) lVar.f6142c).f19671a;
            int a9 = bVar.a(4);
            bundle.putInt(StubApp.getString2(8327), a9 != 0 ? ((ByteBuffer) bVar.f4812d).getInt(a9 + bVar.f4809a) : 0);
            Bundle bundle2 = editorInfo.extras;
            ((Y.h) lVar.f6140a).getClass();
            bundle2.putBoolean(StubApp.getString2(8328), false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i3, int i10) {
        Editable editableText = this.f9237a.getEditableText();
        this.f9238b.getClass();
        return u5.d.s(this, editableText, i3, i10, false) || super.deleteSurroundingText(i3, i10);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i3, int i10) {
        Editable editableText = this.f9237a.getEditableText();
        this.f9238b.getClass();
        return u5.d.s(this, editableText, i3, i10, true) || super.deleteSurroundingTextInCodePoints(i3, i10);
    }
}
