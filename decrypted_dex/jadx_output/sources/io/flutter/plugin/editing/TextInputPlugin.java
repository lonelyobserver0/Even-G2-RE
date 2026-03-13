package io.flutter.plugin.editing;

import P.a;
import Xa.z;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import com.stub.StubApp;
import gb.V;
import gb.e0;
import gb.h0;
import gb.i0;
import gb.j0;
import io.flutter.plugin.editing.ListenableEditingState;
import io.flutter.plugin.platform.PlatformViewsController;
import io.flutter.plugin.platform.PlatformViewsController2;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import p2.h;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class TextInputPlugin implements ListenableEditingState.EditingStateWatcher {
    private static final String TAG = StubApp.getString2(18721);
    private final AutofillManager afm;
    private SparseArray<e0> autofillConfiguration;
    private e0 configuration;
    private ImeSyncDeferringInsetsCallback imeSyncCallback;
    private InputTarget inputTarget = new InputTarget(InputTarget.Type.NO_TARGET, 0);
    private boolean isInputConnectionLocked;
    private Rect lastClientRect;
    private InputConnection lastInputConnection;
    private ListenableEditingState mEditable;
    private final InputMethodManager mImm;
    private h0 mLastKnownFrameworkTextEditingState;
    private boolean mRestartInputPending;
    private final View mView;
    private PlatformViewsController platformViewsController;
    private PlatformViewsController2 platformViewsController2;
    private final V scribeChannel;
    private final j0 textInputChannel;

    public static class InputTarget {
        int id;
        Type type;

        public enum Type {
            NO_TARGET,
            FRAMEWORK_CLIENT,
            VIRTUAL_DISPLAY_PLATFORM_VIEW,
            PHYSICAL_DISPLAY_PLATFORM_VIEW
        }

        public InputTarget(Type type, int i3) {
            this.type = type;
            this.id = i3;
        }
    }

    public interface MinMax {
        void inspect(double d8, double d10);
    }

    @SuppressLint({"NewApi"})
    public TextInputPlugin(View view, j0 j0Var, V v2, PlatformViewsController platformViewsController, PlatformViewsController2 platformViewsController2) {
        this.mView = view;
        this.mEditable = new ListenableEditingState(null, view);
        this.mImm = (InputMethodManager) view.getContext().getSystemService(StubApp.getString2(18353));
        int i3 = Build.VERSION.SDK_INT;
        this.afm = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        if (i3 >= 30) {
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view);
            this.imeSyncCallback = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
        }
        this.textInputChannel = j0Var;
        j0Var.f14360b = new i0() { // from class: io.flutter.plugin.editing.TextInputPlugin.1
            @Override // gb.i0
            public void clearClient() {
                TextInputPlugin.this.clearTextInputClient();
            }

            @Override // gb.i0
            public void finishAutofillContext(boolean z2) {
                if (TextInputPlugin.this.afm == null) {
                    return;
                }
                if (z2) {
                    TextInputPlugin.this.afm.commit();
                } else {
                    TextInputPlugin.this.afm.cancel();
                }
            }

            @Override // gb.i0
            public void hide() {
                if (TextInputPlugin.this.inputTarget.type == InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
                    TextInputPlugin.this.notifyViewExited();
                } else {
                    TextInputPlugin textInputPlugin = TextInputPlugin.this;
                    textInputPlugin.hideTextInput(textInputPlugin.mView);
                }
            }

            @Override // gb.i0
            public void requestAutofill() {
                TextInputPlugin.this.notifyViewEntered();
            }

            @Override // gb.i0
            public void sendAppPrivateCommand(String str, Bundle bundle) {
                TextInputPlugin.this.sendTextInputAppPrivateCommand(str, bundle);
            }

            @Override // gb.i0
            public void setClient(int i10, e0 e0Var) {
                TextInputPlugin.this.setTextInputClient(i10, e0Var);
            }

            @Override // gb.i0
            public void setEditableSizeAndTransform(double d8, double d10, double[] dArr) {
                TextInputPlugin.this.saveEditableSizeAndTransform(d8, d10, dArr);
            }

            @Override // gb.i0
            public void setEditingState(h0 h0Var) {
                TextInputPlugin textInputPlugin = TextInputPlugin.this;
                textInputPlugin.setTextInputEditingState(textInputPlugin.mView, h0Var);
            }

            @Override // gb.i0
            public void setPlatformViewClient(int i10, boolean z2) {
                TextInputPlugin.this.setPlatformViewTextInputClient(i10, z2);
            }

            @Override // gb.i0
            public void show() {
                TextInputPlugin textInputPlugin = TextInputPlugin.this;
                textInputPlugin.showTextInput(textInputPlugin.mView);
            }
        };
        j0Var.f14359a.invokeMethod(StubApp.getString2(18715), null);
        this.scribeChannel = v2;
        this.platformViewsController = platformViewsController;
        platformViewsController.attachTextInputPlugin(this);
        this.platformViewsController2 = platformViewsController2;
        platformViewsController2.attachTextInputPlugin(this);
    }

    private static boolean composingChanged(h0 h0Var, h0 h0Var2) {
        int i3 = h0Var.f14356e;
        int i10 = h0Var.f14355d;
        int i11 = i3 - i10;
        int i12 = h0Var2.f14356e;
        int i13 = h0Var2.f14355d;
        if (i11 != i12 - i13) {
            return true;
        }
        for (int i14 = 0; i14 < i11; i14++) {
            if (h0Var.f14352a.charAt(i14 + i10) != h0Var2.f14352a.charAt(i14 + i13)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideTextInput(View view) {
        notifyViewExited();
        this.mImm.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int inputTypeFromTextInputType(gb.f0 r3, boolean r4, boolean r5, boolean r6, boolean r7, gb.g0 r8) {
        /*
            int r7 = r3.f14341a
            r0 = 4
            r1 = 2
            if (r7 != r1) goto L7
            return r0
        L7:
            r2 = 5
            if (r7 != r2) goto L18
            boolean r4 = r3.f14342b
            if (r4 == 0) goto L10
            r1 = 4098(0x1002, float:5.743E-42)
        L10:
            boolean r3 = r3.f14343c
            if (r3 == 0) goto L17
            r3 = r1 | 8192(0x2000, float:1.148E-41)
            return r3
        L17:
            return r1
        L18:
            r3 = 6
            r1 = 3
            if (r7 != r3) goto L1d
            return r1
        L1d:
            r3 = 11
            if (r7 != r3) goto L23
            r3 = 0
            return r3
        L23:
            r3 = 7
            if (r7 != r3) goto L2a
            r3 = 131073(0x20001, float:1.83672E-40)
            goto L54
        L2a:
            r3 = 8
            if (r7 == r3) goto L52
            r3 = 13
            if (r7 != r3) goto L33
            goto L52
        L33:
            r3 = 9
            if (r7 == r3) goto L4f
            r3 = 12
            if (r7 != r3) goto L3c
            goto L4f
        L3c:
            r3 = 10
            if (r7 != r3) goto L43
            r3 = 145(0x91, float:2.03E-43)
            goto L54
        L43:
            if (r7 != r1) goto L48
            r3 = 97
            goto L54
        L48:
            if (r7 != r0) goto L4d
            r3 = 113(0x71, float:1.58E-43)
            goto L54
        L4d:
            r3 = 1
            goto L54
        L4f:
            r3 = 17
            goto L54
        L52:
            r3 = 33
        L54:
            if (r4 == 0) goto L5b
            r4 = 524416(0x80080, float:7.34863E-40)
        L59:
            r3 = r3 | r4
            goto L67
        L5b:
            if (r5 == 0) goto L61
            r4 = 32768(0x8000, float:4.5918E-41)
            r3 = r3 | r4
        L61:
            if (r6 != 0) goto L67
            r4 = 524432(0x80090, float:7.34886E-40)
            goto L59
        L67:
            gb.g0 r4 = gb.g0.f14345b
            if (r8 != r4) goto L6e
            r3 = r3 | 4096(0x1000, float:5.74E-42)
            return r3
        L6e:
            gb.g0 r4 = gb.g0.f14346c
            if (r8 != r4) goto L75
            r3 = r3 | 8192(0x2000, float:1.148E-41)
            return r3
        L75:
            gb.g0 r4 = gb.g0.f14347d
            if (r8 != r4) goto L7b
            r3 = r3 | 16384(0x4000, float:2.2959E-41)
        L7b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.TextInputPlugin.inputTypeFromTextInputType(gb.f0, boolean, boolean, boolean, boolean, gb.g0):int");
    }

    private boolean needsAutofill() {
        return this.autofillConfiguration != null;
    }

    private void notifyValueChanged(String str) {
        if (this.afm == null || !needsAutofill()) {
            return;
        }
        this.afm.notifyValueChanged(this.mView, ((String) this.configuration.j.f19671a).hashCode(), AutofillValue.forText(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyViewEntered() {
        if (this.afm == null || !needsAutofill()) {
            return;
        }
        String str = (String) this.configuration.j.f19671a;
        int[] iArr = new int[2];
        this.mView.getLocationOnScreen(iArr);
        Rect rect = new Rect(this.lastClientRect);
        rect.offset(iArr[0], iArr[1]);
        this.afm.notifyViewEntered(this.mView, str.hashCode(), rect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyViewExited() {
        e0 e0Var;
        if (this.afm == null || (e0Var = this.configuration) == null || e0Var.j == null || !needsAutofill()) {
            return;
        }
        this.afm.notifyViewExited(this.mView, ((String) this.configuration.j.f19671a).hashCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveEditableSizeAndTransform(double d8, double d10, final double[] dArr) {
        final double[] dArr2 = new double[4];
        final boolean z2 = dArr[3] == 0.0d && dArr[7] == 0.0d && dArr[15] == 1.0d;
        double d11 = dArr[12];
        double d12 = dArr[15];
        double d13 = d11 / d12;
        dArr2[1] = d13;
        dArr2[0] = d13;
        double d14 = dArr[13] / d12;
        dArr2[3] = d14;
        dArr2[2] = d14;
        MinMax minMax = new MinMax() { // from class: io.flutter.plugin.editing.TextInputPlugin.2
            @Override // io.flutter.plugin.editing.TextInputPlugin.MinMax
            public void inspect(double d15, double d16) {
                double d17 = 1.0d;
                if (!z2) {
                    double[] dArr3 = dArr;
                    d17 = 1.0d / (((dArr3[7] * d16) + (dArr3[3] * d15)) + dArr3[15]);
                }
                double[] dArr4 = dArr;
                double d18 = ((dArr4[4] * d16) + (dArr4[0] * d15) + dArr4[12]) * d17;
                double d19 = ((dArr4[5] * d16) + (dArr4[1] * d15) + dArr4[13]) * d17;
                double[] dArr5 = dArr2;
                if (d18 < dArr5[0]) {
                    dArr5[0] = d18;
                } else if (d18 > dArr5[1]) {
                    dArr5[1] = d18;
                }
                if (d19 < dArr5[2]) {
                    dArr5[2] = d19;
                } else if (d19 > dArr5[3]) {
                    dArr5[3] = d19;
                }
            }
        };
        minMax.inspect(d8, 0.0d);
        minMax.inspect(d8, d10);
        minMax.inspect(0.0d, d10);
        double d15 = this.mView.getContext().getResources().getDisplayMetrics().density;
        this.lastClientRect = new Rect((int) (dArr2[0] * d15), (int) (dArr2[2] * d15), (int) Math.ceil(dArr2[1] * d15), (int) Math.ceil(dArr2[3] * d15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlatformViewTextInputClient(int i3, boolean z2) {
        if (!z2) {
            this.inputTarget = new InputTarget(InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW, i3);
            this.lastInputConnection = null;
        } else {
            this.mView.requestFocus();
            this.inputTarget = new InputTarget(InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW, i3);
            this.mImm.restartInput(this.mView);
            this.mRestartInputPending = false;
        }
    }

    private void updateAutofillConfigurationIfNeeded(e0 e0Var) {
        h hVar;
        if (e0Var == null || (hVar = e0Var.j) == null) {
            this.autofillConfiguration = null;
            return;
        }
        SparseArray<e0> sparseArray = new SparseArray<>();
        this.autofillConfiguration = sparseArray;
        e0[] e0VarArr = e0Var.f14340l;
        if (e0VarArr == null) {
            sparseArray.put(((String) hVar.f19671a).hashCode(), e0Var);
            return;
        }
        for (e0 e0Var2 : e0VarArr) {
            h hVar2 = e0Var2.j;
            if (hVar2 != null) {
                SparseArray<e0> sparseArray2 = this.autofillConfiguration;
                String str = (String) hVar2.f19671a;
                sparseArray2.put(str.hashCode(), e0Var2);
                this.afm.notifyValueChanged(this.mView, str.hashCode(), AutofillValue.forText(((h0) hVar2.f19673c).f14352a));
            }
        }
    }

    public void autofill(SparseArray<AutofillValue> sparseArray) {
        h hVar;
        h hVar2;
        e0 e0Var = this.configuration;
        if (e0Var == null || this.autofillConfiguration == null || (hVar = e0Var.j) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            e0 e0Var2 = this.autofillConfiguration.get(sparseArray.keyAt(i3));
            if (e0Var2 != null && (hVar2 = e0Var2.j) != null) {
                String charSequence = sparseArray.valueAt(i3).getTextValue().toString();
                h0 h0Var = new h0(charSequence, charSequence.length(), charSequence.length(), -1, -1);
                if (((String) hVar2.f19671a).equals((String) hVar.f19671a)) {
                    this.mEditable.setEditingState(h0Var);
                } else {
                    hashMap.put((String) hVar2.f19671a, h0Var);
                }
            }
        }
        j0 j0Var = this.textInputChannel;
        int i10 = this.inputTarget.id;
        j0Var.getClass();
        String.valueOf(hashMap.size());
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            h0 h0Var2 = (h0) entry.getValue();
            hashMap2.put((String) entry.getKey(), j0.a(h0Var2.f14352a, h0Var2.f14353b, h0Var2.f14354c, -1, -1));
        }
        j0Var.f14359a.invokeMethod(StubApp.getString2(18716), Arrays.asList(Integer.valueOf(i10), hashMap2));
    }

    public void clearPlatformViewClient(int i3) {
        InputTarget inputTarget = this.inputTarget;
        InputTarget.Type type = inputTarget.type;
        if ((type == InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW || type == InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW) && inputTarget.id == i3) {
            this.inputTarget = new InputTarget(InputTarget.Type.NO_TARGET, 0);
            notifyViewExited();
            this.mImm.hideSoftInputFromWindow(this.mView.getApplicationWindowToken(), 0);
            this.mImm.restartInput(this.mView);
            this.mRestartInputPending = false;
        }
    }

    public void clearTextInputClient() {
        if (this.inputTarget.type == InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            return;
        }
        this.mEditable.removeEditingStateListener(this);
        notifyViewExited();
        this.configuration = null;
        updateAutofillConfigurationIfNeeded(null);
        this.inputTarget = new InputTarget(InputTarget.Type.NO_TARGET, 0);
        unlockPlatformViewInputConnection();
        this.lastClientRect = null;
    }

    public InputConnection createInputConnection(View view, z zVar, EditorInfo editorInfo) {
        InputTarget inputTarget = this.inputTarget;
        InputTarget.Type type = inputTarget.type;
        if (type == InputTarget.Type.NO_TARGET) {
            this.lastInputConnection = null;
            return null;
        }
        if (type == InputTarget.Type.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
            return null;
        }
        if (type == InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            if (this.isInputConnectionLocked) {
                return this.lastInputConnection;
            }
            InputConnection onCreateInputConnection = this.platformViewsController.getPlatformViewById(inputTarget.id).onCreateInputConnection(editorInfo);
            this.lastInputConnection = onCreateInputConnection;
            return onCreateInputConnection;
        }
        e0 e0Var = this.configuration;
        editorInfo.inputType = inputTypeFromTextInputType(e0Var.f14336g, e0Var.f14330a, e0Var.f14331b, e0Var.f14332c, e0Var.f14333d, e0Var.f14335f);
        editorInfo.imeOptions = 33554432;
        int i3 = Build.VERSION.SDK_INT;
        e0 e0Var2 = this.configuration;
        if (!e0Var2.f14333d) {
            editorInfo.imeOptions = 50331648;
        }
        int intValue = e0Var2.f14337h.intValue();
        e0 e0Var3 = this.configuration;
        String str = e0Var3.f14338i;
        if (str != null) {
            editorInfo.actionLabel = str;
            editorInfo.actionId = intValue;
        }
        editorInfo.imeOptions = intValue | editorInfo.imeOptions;
        String[] strArr = e0Var3.f14339k;
        if (strArr != null) {
            editorInfo.contentMimeTypes = strArr;
        }
        if (i3 >= 34) {
            if (i3 >= 35) {
                a.b(editorInfo);
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            editorInfo.extras.putBoolean(StubApp.getString2(18717), true);
        }
        InputConnectionAdaptor inputConnectionAdaptor = new InputConnectionAdaptor(view, this.inputTarget.id, this.textInputChannel, this.scribeChannel, zVar, this.mEditable, editorInfo);
        editorInfo.initialSelStart = this.mEditable.getSelectionStart();
        editorInfo.initialSelEnd = this.mEditable.getSelectionEnd();
        this.lastInputConnection = inputConnectionAdaptor;
        return inputConnectionAdaptor;
    }

    @SuppressLint({"NewApi"})
    public void destroy() {
        this.platformViewsController.detachTextInputPlugin();
        this.platformViewsController2.detachTextInputPlugin();
        this.textInputChannel.f14360b = null;
        notifyViewExited();
        this.mEditable.removeEditingStateListener(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.imeSyncCallback;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        if (r6 == r1.f14356e) goto L28;
     */
    @Override // io.flutter.plugin.editing.ListenableEditingState.EditingStateWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void didChangeEditingState(boolean r11, boolean r12, boolean r13) {
        /*
            r10 = this;
            r12 = 1
            r13 = 0
            r0 = 2
            if (r11 == 0) goto Le
            io.flutter.plugin.editing.ListenableEditingState r11 = r10.mEditable
            java.lang.String r11 = r11.toString()
            r10.notifyValueChanged(r11)
        Le:
            io.flutter.plugin.editing.ListenableEditingState r11 = r10.mEditable
            int r3 = r11.getSelectionStart()
            io.flutter.plugin.editing.ListenableEditingState r11 = r10.mEditable
            int r4 = r11.getSelectionEnd()
            io.flutter.plugin.editing.ListenableEditingState r11 = r10.mEditable
            int r5 = r11.getComposingStart()
            io.flutter.plugin.editing.ListenableEditingState r11 = r10.mEditable
            int r6 = r11.getComposingEnd()
            io.flutter.plugin.editing.ListenableEditingState r11 = r10.mEditable
            java.util.ArrayList r11 = r11.extractBatchTextEditingDeltas()
            gb.h0 r1 = r10.mLastKnownFrameworkTextEditingState
            if (r1 == 0) goto Lf2
            io.flutter.plugin.editing.ListenableEditingState r1 = r10.mEditable
            java.lang.String r1 = r1.toString()
            gb.h0 r2 = r10.mLastKnownFrameworkTextEditingState
            java.lang.String r2 = r2.f14352a
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L54
            gb.h0 r1 = r10.mLastKnownFrameworkTextEditingState
            int r2 = r1.f14353b
            if (r3 != r2) goto L54
            int r2 = r1.f14354c
            if (r4 != r2) goto L54
            int r2 = r1.f14355d
            if (r5 != r2) goto L54
            int r1 = r1.f14356e
            if (r6 != r1) goto L54
            goto Lf2
        L54:
            io.flutter.plugin.editing.ListenableEditingState r1 = r10.mEditable
            r1.toString()
            gb.e0 r1 = r10.configuration
            boolean r1 = r1.f14334e
            if (r1 == 0) goto Lb7
            gb.j0 r1 = r10.textInputChannel
            io.flutter.plugin.editing.TextInputPlugin$InputTarget r2 = r10.inputTarget
            int r2 = r2.id
            r1.getClass()
            r11.size()
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            org.json.JSONArray r8 = new org.json.JSONArray
            r8.<init>()
            java.util.Iterator r11 = r11.iterator()
        L79:
            boolean r9 = r11.hasNext()
            if (r9 == 0) goto L8d
            java.lang.Object r9 = r11.next()
            io.flutter.plugin.editing.TextEditingDelta r9 = (io.flutter.plugin.editing.TextEditingDelta) r9
            org.json.JSONObject r9 = r9.toJSON()
            r8.put(r9)
            goto L79
        L8d:
            r11 = 18718(0x491e, float:2.623E-41)
            java.lang.String r11 = com.stub.StubApp.getString2(r11)
            r7.put(r11, r8)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            java.io.Serializable[] r0 = new java.io.Serializable[r0]
            r0[r13] = r11
            r0[r12] = r7
            java.util.List r11 = java.util.Arrays.asList(r0)
            io.flutter.plugin.common.MethodChannel r12 = r1.f14359a
            r13 = 18719(0x491f, float:2.6231E-41)
            java.lang.String r13 = com.stub.StubApp.getString2(r13)
            r12.invokeMethod(r13, r11)
            io.flutter.plugin.editing.ListenableEditingState r11 = r10.mEditable
            r11.clearBatchDeltas()
            goto Le4
        Lb7:
            gb.j0 r11 = r10.textInputChannel
            io.flutter.plugin.editing.TextInputPlugin$InputTarget r1 = r10.inputTarget
            int r1 = r1.id
            io.flutter.plugin.editing.ListenableEditingState r2 = r10.mEditable
            java.lang.String r2 = r2.toString()
            r11.getClass()
            java.util.HashMap r2 = gb.j0.a(r2, r3, r4, r5, r6)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.io.Serializable[] r0 = new java.io.Serializable[r0]
            r0[r13] = r1
            r0[r12] = r2
            java.util.List r12 = java.util.Arrays.asList(r0)
            io.flutter.plugin.common.MethodChannel r11 = r11.f14359a
            r13 = 18720(0x4920, float:2.6232E-41)
            java.lang.String r13 = com.stub.StubApp.getString2(r13)
            r11.invokeMethod(r13, r12)
        Le4:
            gb.h0 r1 = new gb.h0
            io.flutter.plugin.editing.ListenableEditingState r11 = r10.mEditable
            java.lang.String r2 = r11.toString()
            r1.<init>(r2, r3, r4, r5, r6)
            r10.mLastKnownFrameworkTextEditingState = r1
            return
        Lf2:
            io.flutter.plugin.editing.ListenableEditingState r11 = r10.mEditable
            r11.clearBatchDeltas()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.TextInputPlugin.didChangeEditingState(boolean, boolean, boolean):void");
    }

    public Editable getEditable() {
        return this.mEditable;
    }

    public ImeSyncDeferringInsetsCallback getImeSyncCallback() {
        return this.imeSyncCallback;
    }

    public InputMethodManager getInputMethodManager() {
        return this.mImm;
    }

    public InputConnection getLastInputConnection() {
        return this.lastInputConnection;
    }

    public boolean handleKeyEvent(KeyEvent keyEvent) {
        InputConnection inputConnection;
        if (!getInputMethodManager().isAcceptingText() || (inputConnection = this.lastInputConnection) == null) {
            return false;
        }
        return inputConnection instanceof InputConnectionAdaptor ? ((InputConnectionAdaptor) inputConnection).handleKeyEvent(keyEvent) : inputConnection.sendKeyEvent(keyEvent);
    }

    public void lockPlatformViewInputConnection() {
        if (this.inputTarget.type == InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.isInputConnectionLocked = true;
        }
    }

    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i3) {
        Rect rect;
        if (needsAutofill()) {
            String str = (String) this.configuration.j.f19671a;
            AutofillId autofillId = viewStructure.getAutofillId();
            for (int i10 = 0; i10 < this.autofillConfiguration.size(); i10++) {
                int keyAt = this.autofillConfiguration.keyAt(i10);
                h hVar = this.autofillConfiguration.valueAt(i10).j;
                if (hVar != null) {
                    viewStructure.addChildCount(1);
                    ViewStructure newChild = viewStructure.newChild(i10);
                    newChild.setAutofillId(autofillId, keyAt);
                    String[] strArr = (String[]) hVar.f19672b;
                    if (strArr.length > 0) {
                        newChild.setAutofillHints(strArr);
                    }
                    newChild.setAutofillType(1);
                    newChild.setVisibility(0);
                    String str2 = (String) hVar.f19674d;
                    if (str2 != null) {
                        newChild.setHint(str2);
                    }
                    if (str.hashCode() != keyAt || (rect = this.lastClientRect) == null) {
                        newChild.setDimens(0, 0, 0, 0, 1, 1);
                        newChild.setAutofillValue(AutofillValue.forText(((h0) hVar.f19673c).f14352a));
                    } else {
                        newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), this.lastClientRect.height());
                        newChild.setAutofillValue(AutofillValue.forText(this.mEditable));
                    }
                }
            }
        }
    }

    public void sendTextInputAppPrivateCommand(String str, Bundle bundle) {
        this.mImm.sendAppPrivateCommand(this.mView, str, bundle);
    }

    public void setTextInputClient(int i3, e0 e0Var) {
        notifyViewExited();
        this.configuration = e0Var;
        this.inputTarget = new InputTarget(InputTarget.Type.FRAMEWORK_CLIENT, i3);
        this.mEditable.removeEditingStateListener(this);
        h hVar = e0Var.j;
        this.mEditable = new ListenableEditingState(hVar != null ? (h0) hVar.f19673c : null, this.mView);
        updateAutofillConfigurationIfNeeded(e0Var);
        this.mRestartInputPending = true;
        unlockPlatformViewInputConnection();
        this.lastClientRect = null;
        this.mEditable.addEditingStateListener(this);
    }

    public void setTextInputEditingState(View view, h0 h0Var) {
        h0 h0Var2;
        int i3;
        if (!this.mRestartInputPending && (h0Var2 = this.mLastKnownFrameworkTextEditingState) != null && (i3 = h0Var2.f14355d) >= 0 && h0Var2.f14356e > i3) {
            this.mRestartInputPending = composingChanged(h0Var2, h0Var);
        }
        this.mLastKnownFrameworkTextEditingState = h0Var;
        this.mEditable.setEditingState(h0Var);
        if (this.mRestartInputPending) {
            this.mImm.restartInput(view);
            this.mRestartInputPending = false;
        }
    }

    public void showTextInput(View view) {
        e0 e0Var = this.configuration;
        if (e0Var != null && e0Var.f14336g.f14341a == 11) {
            hideTextInput(view);
        } else {
            view.requestFocus();
            this.mImm.showSoftInput(view, 0);
        }
    }

    public void unlockPlatformViewInputConnection() {
        if (this.inputTarget.type == InputTarget.Type.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.isInputConnectionLocked = false;
        }
    }
}
