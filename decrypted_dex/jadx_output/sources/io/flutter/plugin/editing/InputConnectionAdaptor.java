package io.flutter.plugin.editing;

import android.annotation.TargetApi;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.DynamicLayout;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InputMethodManager;
import com.stub.StubApp;
import gb.V;
import gb.j0;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.editing.ListenableEditingState;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.jvm.internal.IntCompanionObject;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class InputConnectionAdaptor extends BaseInputConnection implements ListenableEditingState.EditingStateWatcher {
    private static final String TAG = StubApp.getString2(18693);
    private int batchEditNestDepth;
    private FlutterTextUtils flutterTextUtils;
    private final KeyboardDelegate keyboardDelegate;
    private final int mClient;
    private CursorAnchorInfo.Builder mCursorAnchorInfoBuilder;
    private final ListenableEditingState mEditable;
    private final EditorInfo mEditorInfo;
    private ExtractedTextRequest mExtractRequest;
    private ExtractedText mExtractedText;
    private final View mFlutterView;
    private InputMethodManager mImm;
    private final Layout mLayout;
    private boolean mMonitorCursorUpdate;
    private final V scribeChannel;
    private final j0 textInputChannel;

    public interface KeyboardDelegate {
        boolean handleEvent(KeyEvent keyEvent);
    }

    public InputConnectionAdaptor(View view, int i3, j0 j0Var, V v2, KeyboardDelegate keyboardDelegate, ListenableEditingState listenableEditingState, EditorInfo editorInfo, FlutterJNI flutterJNI) {
        super(view, true);
        this.mMonitorCursorUpdate = false;
        this.mExtractedText = new ExtractedText();
        this.batchEditNestDepth = 0;
        this.mFlutterView = view;
        this.mClient = i3;
        this.textInputChannel = j0Var;
        this.scribeChannel = v2;
        this.mEditable = listenableEditingState;
        listenableEditingState.addEditingStateListener(this);
        this.mEditorInfo = editorInfo;
        this.keyboardDelegate = keyboardDelegate;
        this.flutterTextUtils = new FlutterTextUtils(flutterJNI);
        this.mLayout = new DynamicLayout(listenableEditingState, new TextPaint(), IntCompanionObject.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.mImm = (InputMethodManager) view.getContext().getSystemService(StubApp.getString2(18353));
    }

    private static int clampIndexToEditable(int i3, Editable editable) {
        return Math.max(0, Math.min(editable.length(), i3));
    }

    private boolean doPerformContextMenuAction(int i3) {
        if (i3 == 16908319) {
            setSelection(0, this.mEditable.length());
            return true;
        }
        String string2 = StubApp.getString2(18686);
        String string22 = StubApp.getString2(18687);
        if (i3 == 16908320) {
            int selectionStart = Selection.getSelectionStart(this.mEditable);
            int selectionEnd = Selection.getSelectionEnd(this.mEditable);
            if (selectionStart != selectionEnd) {
                int min = Math.min(selectionStart, selectionEnd);
                int max = Math.max(selectionStart, selectionEnd);
                ((ClipboardManager) this.mFlutterView.getContext().getSystemService(string22)).setPrimaryClip(ClipData.newPlainText(string2, this.mEditable.subSequence(min, max)));
                this.mEditable.delete(min, max);
                setSelection(min, min);
            }
            return true;
        }
        if (i3 == 16908321) {
            int selectionStart2 = Selection.getSelectionStart(this.mEditable);
            int selectionEnd2 = Selection.getSelectionEnd(this.mEditable);
            if (selectionStart2 != selectionEnd2) {
                ((ClipboardManager) this.mFlutterView.getContext().getSystemService(string22)).setPrimaryClip(ClipData.newPlainText(string2, this.mEditable.subSequence(Math.min(selectionStart2, selectionEnd2), Math.max(selectionStart2, selectionEnd2))));
            }
            return true;
        }
        if (i3 != 16908322) {
            return false;
        }
        ClipData primaryClip = ((ClipboardManager) this.mFlutterView.getContext().getSystemService(string22)).getPrimaryClip();
        if (primaryClip != null) {
            CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(this.mFlutterView.getContext());
            int max2 = Math.max(0, Selection.getSelectionStart(this.mEditable));
            int max3 = Math.max(0, Selection.getSelectionEnd(this.mEditable));
            int min2 = Math.min(max2, max3);
            int max4 = Math.max(max2, max3);
            if (min2 != max4) {
                this.mEditable.delete(min2, max4);
            }
            this.mEditable.insert(min2, coerceToText);
            int length = coerceToText.length() + min2;
            setSelection(length, length);
        }
        return true;
    }

    private CursorAnchorInfo getCursorAnchorInfo() {
        CursorAnchorInfo.Builder builder = this.mCursorAnchorInfoBuilder;
        if (builder == null) {
            this.mCursorAnchorInfoBuilder = new CursorAnchorInfo.Builder();
        } else {
            builder.reset();
        }
        this.mCursorAnchorInfoBuilder.setSelectionRange(this.mEditable.getSelectionStart(), this.mEditable.getSelectionEnd());
        int composingStart = this.mEditable.getComposingStart();
        int composingEnd = this.mEditable.getComposingEnd();
        if (composingStart < 0 || composingEnd <= composingStart) {
            this.mCursorAnchorInfoBuilder.setComposingText(-1, "");
        } else {
            this.mCursorAnchorInfoBuilder.setComposingText(composingStart, this.mEditable.toString().subSequence(composingStart, composingEnd));
        }
        return this.mCursorAnchorInfoBuilder.build();
    }

    private ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest) {
        ExtractedText extractedText = this.mExtractedText;
        extractedText.startOffset = 0;
        extractedText.partialStartOffset = -1;
        extractedText.partialEndOffset = -1;
        extractedText.selectionStart = this.mEditable.getSelectionStart();
        this.mExtractedText.selectionEnd = this.mEditable.getSelectionEnd();
        this.mExtractedText.text = (extractedTextRequest == null || (extractedTextRequest.flags & 1) == 0) ? this.mEditable.toString() : this.mEditable;
        return this.mExtractedText;
    }

    private boolean handleHorizontalMovement(boolean z2, boolean z10) {
        int selectionStart = Selection.getSelectionStart(this.mEditable);
        int selectionEnd = Selection.getSelectionEnd(this.mEditable);
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        int max = z2 ? Math.max(this.flutterTextUtils.getOffsetBefore(this.mEditable, selectionEnd), 0) : Math.min(this.flutterTextUtils.getOffsetAfter(this.mEditable, selectionEnd), this.mEditable.length());
        if (selectionStart != selectionEnd || z10) {
            setSelection(selectionStart, max);
            return true;
        }
        setSelection(max, max);
        return true;
    }

    private boolean handleVerticalMovement(boolean z2, boolean z10) {
        int selectionStart = Selection.getSelectionStart(this.mEditable);
        int selectionEnd = Selection.getSelectionEnd(this.mEditable);
        boolean z11 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        if (selectionStart == selectionEnd && !z10) {
            z11 = true;
        }
        beginBatchEdit();
        if (z11) {
            if (z2) {
                Selection.moveUp(this.mEditable, this.mLayout);
            } else {
                Selection.moveDown(this.mEditable, this.mLayout);
            }
            int selectionStart2 = Selection.getSelectionStart(this.mEditable);
            setSelection(selectionStart2, selectionStart2);
        } else {
            if (z2) {
                Selection.extendUp(this.mEditable, this.mLayout);
            } else {
                Selection.extendDown(this.mEditable, this.mLayout);
            }
            setSelection(Selection.getSelectionStart(this.mEditable), Selection.getSelectionEnd(this.mEditable));
        }
        endBatchEdit();
        return true;
    }

    private byte[] readStreamFully(InputStream inputStream, int i3) {
        int i10;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[i3];
        while (true) {
            try {
                i10 = inputStream.read(bArr);
            } catch (IOException unused) {
                i10 = -1;
            }
            if (i10 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        this.mEditable.beginBatchEdit();
        this.batchEditNestDepth++;
        return super.beginBatchEdit();
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i3) {
        return super.clearMetaKeyStates(i3);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public void closeConnection() {
        super.closeConnection();
        this.mEditable.removeEditingStateListener(this);
        while (this.batchEditNestDepth > 0) {
            endBatchEdit();
            this.batchEditNestDepth--;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    @TargetApi(25)
    public boolean commitContent(InputContentInfo inputContentInfo, int i3, Bundle bundle) {
        if ((i3 & 1) != 0) {
            try {
                inputContentInfo.requestPermission();
                if (inputContentInfo.getDescription().getMimeTypeCount() > 0) {
                    inputContentInfo.requestPermission();
                    Uri contentUri = inputContentInfo.getContentUri();
                    String mimeType = inputContentInfo.getDescription().getMimeType(0);
                    Context context = this.mFlutterView.getContext();
                    if (contentUri != null) {
                        try {
                            InputStream openInputStream = context.getContentResolver().openInputStream(contentUri);
                            if (openInputStream != null) {
                                byte[] readStreamFully = readStreamFully(openInputStream, PKIFailureInfo.notAuthorized);
                                HashMap hashMap = new HashMap();
                                hashMap.put(StubApp.getString2(18688), mimeType);
                                hashMap.put(StubApp.getString2(1485), readStreamFully);
                                hashMap.put(StubApp.getString2(614), contentUri.toString());
                                j0 j0Var = this.textInputChannel;
                                int i10 = this.mClient;
                                j0Var.getClass();
                                j0Var.f14359a.invokeMethod(StubApp.getString2(18690), Arrays.asList(Integer.valueOf(i10), StubApp.getString2(18689), hashMap));
                                inputContentInfo.releasePermission();
                                return true;
                            }
                        } catch (FileNotFoundException unused) {
                            inputContentInfo.releasePermission();
                            return false;
                        }
                    }
                    inputContentInfo.releasePermission();
                }
            } catch (Exception unused2) {
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i3) {
        return super.commitText(charSequence, i3);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i3, int i10) {
        if (this.mEditable.getSelectionStart() == -1) {
            return true;
        }
        return super.deleteSurroundingText(i3, i10);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i3, int i10) {
        return super.deleteSurroundingTextInCodePoints(i3, i10);
    }

    @Override // io.flutter.plugin.editing.ListenableEditingState.EditingStateWatcher
    public void didChangeEditingState(boolean z2, boolean z10, boolean z11) {
        this.mImm.updateSelection(this.mFlutterView, this.mEditable.getSelectionStart(), this.mEditable.getSelectionEnd(), this.mEditable.getComposingStart(), this.mEditable.getComposingEnd());
        ExtractedTextRequest extractedTextRequest = this.mExtractRequest;
        if (extractedTextRequest != null) {
            this.mImm.updateExtractedText(this.mFlutterView, extractedTextRequest.token, getExtractedText(extractedTextRequest));
        }
        if (this.mMonitorCursorUpdate) {
            this.mImm.updateCursorAnchorInfo(this.mFlutterView, getCursorAnchorInfo());
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        boolean endBatchEdit = super.endBatchEdit();
        this.batchEditNestDepth--;
        this.mEditable.endBatchEdit();
        return endBatchEdit;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        return super.finishComposingText();
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public Editable getEditable() {
        return this.mEditable;
    }

    public boolean handleKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            if (keyEvent.getKeyCode() == 21) {
                return handleHorizontalMovement(true, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 22) {
                return handleHorizontalMovement(false, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 19) {
                return handleVerticalMovement(true, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 20) {
                return handleVerticalMovement(false, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                EditorInfo editorInfo = this.mEditorInfo;
                if ((editorInfo.inputType & PKIFailureInfo.unsupportedVersion) == 0) {
                    performEditorAction(editorInfo.imeOptions & 255);
                    return true;
                }
            }
            int selectionStart = Selection.getSelectionStart(this.mEditable);
            int selectionEnd = Selection.getSelectionEnd(this.mEditable);
            int unicodeChar = keyEvent.getUnicodeChar();
            if (selectionStart >= 0 && selectionEnd >= 0 && unicodeChar != 0) {
                int min = Math.min(selectionStart, selectionEnd);
                int max = Math.max(selectionStart, selectionEnd);
                beginBatchEdit();
                if (min != max) {
                    this.mEditable.delete(min, max);
                }
                this.mEditable.insert(min, (CharSequence) String.valueOf((char) unicodeChar));
                int i3 = min + 1;
                setSelection(i3, i3);
                endBatchEdit();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i3) {
        beginBatchEdit();
        boolean doPerformContextMenuAction = doPerformContextMenuAction(i3);
        endBatchEdit();
        return doPerformContextMenuAction;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i3) {
        String string2 = StubApp.getString2(18690);
        if (i3 == 0) {
            j0 j0Var = this.textInputChannel;
            int i10 = this.mClient;
            j0Var.getClass();
            j0Var.f14359a.invokeMethod(string2, Arrays.asList(Integer.valueOf(i10), StubApp.getString2(18691)));
        } else if (i3 == 1) {
            j0 j0Var2 = this.textInputChannel;
            int i11 = this.mClient;
            j0Var2.getClass();
            j0Var2.f14359a.invokeMethod(string2, Arrays.asList(Integer.valueOf(i11), StubApp.getString2(17911)));
        } else if (i3 == 2) {
            j0 j0Var3 = this.textInputChannel;
            int i12 = this.mClient;
            j0Var3.getClass();
            j0Var3.f14359a.invokeMethod(string2, Arrays.asList(Integer.valueOf(i12), StubApp.getString2(17912)));
        } else if (i3 == 3) {
            j0 j0Var4 = this.textInputChannel;
            int i13 = this.mClient;
            j0Var4.getClass();
            j0Var4.f14359a.invokeMethod(string2, Arrays.asList(Integer.valueOf(i13), StubApp.getString2(17913)));
        } else if (i3 == 4) {
            j0 j0Var5 = this.textInputChannel;
            int i14 = this.mClient;
            j0Var5.getClass();
            j0Var5.f14359a.invokeMethod(string2, Arrays.asList(Integer.valueOf(i14), StubApp.getString2(17914)));
        } else if (i3 == 5) {
            j0 j0Var6 = this.textInputChannel;
            int i15 = this.mClient;
            j0Var6.getClass();
            j0Var6.f14359a.invokeMethod(string2, Arrays.asList(Integer.valueOf(i15), StubApp.getString2(17916)));
        } else if (i3 != 7) {
            j0 j0Var7 = this.textInputChannel;
            int i16 = this.mClient;
            j0Var7.getClass();
            j0Var7.f14359a.invokeMethod(string2, Arrays.asList(Integer.valueOf(i16), StubApp.getString2(17917)));
        } else {
            j0 j0Var8 = this.textInputChannel;
            int i17 = this.mClient;
            j0Var8.getClass();
            j0Var8.f14359a.invokeMethod(string2, Arrays.asList(Integer.valueOf(i17), StubApp.getString2(17910)));
        }
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        j0 j0Var = this.textInputChannel;
        int i3 = this.mClient;
        j0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(StubApp.getString2(652), str);
        if (bundle != null) {
            HashMap hashMap2 = new HashMap();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj instanceof byte[]) {
                    hashMap2.put(str2, bundle.getByteArray(str2));
                } else if (obj instanceof Byte) {
                    hashMap2.put(str2, Byte.valueOf(bundle.getByte(str2)));
                } else if (obj instanceof char[]) {
                    hashMap2.put(str2, bundle.getCharArray(str2));
                } else if (obj instanceof Character) {
                    hashMap2.put(str2, Character.valueOf(bundle.getChar(str2)));
                } else if (obj instanceof CharSequence[]) {
                    hashMap2.put(str2, bundle.getCharSequenceArray(str2));
                } else if (obj instanceof CharSequence) {
                    hashMap2.put(str2, bundle.getCharSequence(str2));
                } else if (obj instanceof float[]) {
                    hashMap2.put(str2, bundle.getFloatArray(str2));
                } else if (obj instanceof Float) {
                    hashMap2.put(str2, Float.valueOf(bundle.getFloat(str2)));
                }
            }
            hashMap.put(StubApp.getString2(1485), hashMap2);
        }
        j0Var.f14359a.invokeMethod(StubApp.getString2(18692), Arrays.asList(Integer.valueOf(i3), hashMap));
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i3) {
        if ((i3 & 1) != 0) {
            this.mImm.updateCursorAnchorInfo(this.mFlutterView, getCursorAnchorInfo());
        }
        this.mMonitorCursorUpdate = (i3 & 2) != 0;
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        return this.keyboardDelegate.handleEvent(keyEvent);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i3, int i10) {
        return super.setComposingRegion(i3, i10);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i3) {
        beginBatchEdit();
        boolean commitText = charSequence.length() == 0 ? super.commitText(charSequence, i3) : super.setComposingText(charSequence, i3);
        endBatchEdit();
        return commitText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setSelection(int i3, int i10) {
        beginBatchEdit();
        boolean selection = super.setSelection(i3, i10);
        endBatchEdit();
        return selection;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i3) {
        this.mExtractRequest = (i3 & 1) != 0 ? extractedTextRequest : null;
        return getExtractedText(extractedTextRequest);
    }

    public InputConnectionAdaptor(View view, int i3, j0 j0Var, V v2, KeyboardDelegate keyboardDelegate, ListenableEditingState listenableEditingState, EditorInfo editorInfo) {
        this(view, i3, j0Var, v2, keyboardDelegate, listenableEditingState, editorInfo, new FlutterJNI());
    }
}
