package io.flutter.plugin.editing;

import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import com.stub.StubApp;
import gb.h0;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
class ListenableEditingState extends SpannableStringBuilder {
    private static final String TAG = StubApp.getString2(18694);
    private int mComposingEndWhenBeginBatchEdit;
    private int mComposingStartWhenBeginBatchEdit;
    private BaseInputConnection mDummyConnection;
    private int mSelectionEndWhenBeginBatchEdit;
    private int mSelectionStartWhenBeginBatchEdit;
    private String mTextWhenBeginBatchEdit;
    private String mToStringCache;
    private int mBatchEditNestDepth = 0;
    private int mChangeNotificationDepth = 0;
    private ArrayList<EditingStateWatcher> mListeners = new ArrayList<>();
    private ArrayList<EditingStateWatcher> mPendingListeners = new ArrayList<>();
    private ArrayList<TextEditingDelta> mBatchTextEditingDeltas = new ArrayList<>();

    public interface EditingStateWatcher {
        void didChangeEditingState(boolean z2, boolean z10, boolean z11);
    }

    public ListenableEditingState(h0 h0Var, View view) {
        this.mDummyConnection = new BaseInputConnection(view, true) { // from class: io.flutter.plugin.editing.ListenableEditingState.1
            @Override // android.view.inputmethod.BaseInputConnection
            public Editable getEditable() {
                return this;
            }
        };
        if (h0Var != null) {
            setEditingState(h0Var);
        }
    }

    private void notifyListener(EditingStateWatcher editingStateWatcher, boolean z2, boolean z10, boolean z11) {
        this.mChangeNotificationDepth++;
        editingStateWatcher.didChangeEditingState(z2, z10, z11);
        this.mChangeNotificationDepth--;
    }

    private void notifyListenersIfNeeded(boolean z2, boolean z10, boolean z11) {
        if (z2 || z10 || z11) {
            Iterator<EditingStateWatcher> it = this.mListeners.iterator();
            while (it.hasNext()) {
                notifyListener(it.next(), z2, z10, z11);
            }
        }
    }

    public void addEditingStateListener(EditingStateWatcher editingStateWatcher) {
        int i3 = this.mChangeNotificationDepth;
        String string2 = StubApp.getString2(18694);
        if (i3 > 0) {
            Log.e(string2, StubApp.getString2(18695) + editingStateWatcher.toString() + StubApp.getString2(18696));
        }
        if (this.mBatchEditNestDepth <= 0) {
            this.mListeners.add(editingStateWatcher);
        } else {
            Log.w(string2, StubApp.getString2(18697));
            this.mPendingListeners.add(editingStateWatcher);
        }
    }

    public void beginBatchEdit() {
        this.mBatchEditNestDepth++;
        if (this.mChangeNotificationDepth > 0) {
            Log.e(StubApp.getString2(18694), StubApp.getString2(18698));
        }
        if (this.mBatchEditNestDepth != 1 || this.mListeners.isEmpty()) {
            return;
        }
        this.mTextWhenBeginBatchEdit = toString();
        this.mSelectionStartWhenBeginBatchEdit = getSelectionStart();
        this.mSelectionEndWhenBeginBatchEdit = getSelectionEnd();
        this.mComposingStartWhenBeginBatchEdit = getComposingStart();
        this.mComposingEndWhenBeginBatchEdit = getComposingEnd();
    }

    public void clearBatchDeltas() {
        this.mBatchTextEditingDeltas.clear();
    }

    public void endBatchEdit() {
        int i3 = this.mBatchEditNestDepth;
        if (i3 == 0) {
            Log.e(StubApp.getString2(18694), StubApp.getString2(18699));
            return;
        }
        if (i3 == 1) {
            Iterator<EditingStateWatcher> it = this.mPendingListeners.iterator();
            while (it.hasNext()) {
                notifyListener(it.next(), true, true, true);
            }
            if (!this.mListeners.isEmpty()) {
                String.valueOf(this.mListeners.size());
                notifyListenersIfNeeded(!toString().equals(this.mTextWhenBeginBatchEdit), (this.mSelectionStartWhenBeginBatchEdit == getSelectionStart() && this.mSelectionEndWhenBeginBatchEdit == getSelectionEnd()) ? false : true, (this.mComposingStartWhenBeginBatchEdit == getComposingStart() && this.mComposingEndWhenBeginBatchEdit == getComposingEnd()) ? false : true);
            }
        }
        this.mListeners.addAll(this.mPendingListeners);
        this.mPendingListeners.clear();
        this.mBatchEditNestDepth--;
    }

    public ArrayList<TextEditingDelta> extractBatchTextEditingDeltas() {
        ArrayList<TextEditingDelta> arrayList = new ArrayList<>(this.mBatchTextEditingDeltas);
        this.mBatchTextEditingDeltas.clear();
        return arrayList;
    }

    public final int getComposingEnd() {
        return BaseInputConnection.getComposingSpanEnd(this);
    }

    public final int getComposingStart() {
        return BaseInputConnection.getComposingSpanStart(this);
    }

    public final int getSelectionEnd() {
        return Selection.getSelectionEnd(this);
    }

    public final int getSelectionStart() {
        return Selection.getSelectionStart(this);
    }

    public void removeEditingStateListener(EditingStateWatcher editingStateWatcher) {
        if (this.mChangeNotificationDepth > 0) {
            Log.e(StubApp.getString2(18694), StubApp.getString2(18700) + editingStateWatcher.toString() + StubApp.getString2(18696));
        }
        this.mListeners.remove(editingStateWatcher);
        if (this.mBatchEditNestDepth > 0) {
            this.mPendingListeners.remove(editingStateWatcher);
        }
    }

    public void setComposingRange(int i3, int i10) {
        if (i3 < 0 || i3 >= i10) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.mDummyConnection.setComposingRegion(i3, i10);
        }
    }

    public void setEditingState(h0 h0Var) {
        beginBatchEdit();
        replace(0, length(), (CharSequence) h0Var.f14352a);
        int i3 = h0Var.f14353b;
        if (i3 >= 0) {
            Selection.setSelection(this, i3, h0Var.f14354c);
        } else {
            Selection.removeSelection(this);
        }
        setComposingRange(h0Var.f14355d, h0Var.f14356e);
        clearBatchDeltas();
        endBatchEdit();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object obj, int i3, int i10, int i11) {
        super.setSpan(obj, i3, i10, i11);
        this.mBatchTextEditingDeltas.add(new TextEditingDelta(toString(), getSelectionStart(), getSelectionEnd(), getComposingStart(), getComposingEnd()));
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public String toString() {
        String str = this.mToStringCache;
        if (str != null) {
            return str;
        }
        String spannableStringBuilder = super.toString();
        this.mToStringCache = spannableStringBuilder;
        return spannableStringBuilder;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i3, int i10, CharSequence charSequence, int i11, int i12) {
        if (this.mChangeNotificationDepth > 0) {
            Log.e(StubApp.getString2(18694), StubApp.getString2(18698));
        }
        String listenableEditingState = toString();
        int i13 = i10 - i3;
        boolean z2 = i13 != i12 - i11;
        for (int i14 = 0; i14 < i13 && !z2; i14++) {
            z2 |= charAt(i3 + i14) != charSequence.charAt(i11 + i14);
        }
        if (z2) {
            this.mToStringCache = null;
        }
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        int composingStart = getComposingStart();
        int composingEnd = getComposingEnd();
        SpannableStringBuilder replace = super.replace(i3, i10, charSequence, i11, i12);
        this.mBatchTextEditingDeltas.add(new TextEditingDelta(listenableEditingState, i3, i10, charSequence, getSelectionStart(), getSelectionEnd(), getComposingStart(), getComposingEnd()));
        if (this.mBatchEditNestDepth > 0) {
            return replace;
        }
        notifyListenersIfNeeded(z2, (getSelectionStart() == selectionStart && getSelectionEnd() == selectionEnd) ? false : true, (getComposingStart() == composingStart && getComposingEnd() == composingEnd) ? false : true);
        return replace;
    }
}
