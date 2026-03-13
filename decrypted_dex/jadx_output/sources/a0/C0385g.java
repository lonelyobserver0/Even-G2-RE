package a0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* renamed from: a0.g, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0385g extends Y3.a {

    /* renamed from: f, reason: collision with root package name */
    public final TextView f9245f;

    /* renamed from: g, reason: collision with root package name */
    public final C0383e f9246g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9247h = true;

    public C0385g(TextView textView) {
        this.f9245f = textView;
        this.f9246g = new C0383e(textView);
    }

    @Override // Y3.a
    public final TransformationMethod D(TransformationMethod transformationMethod) {
        return this.f9247h ? ((transformationMethod instanceof C0389k) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new C0389k(transformationMethod) : transformationMethod instanceof C0389k ? ((C0389k) transformationMethod).f9254a : transformationMethod;
    }

    @Override // Y3.a
    public final InputFilter[] l(InputFilter[] inputFilterArr) {
        if (!this.f9247h) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i3 = 0; i3 < inputFilterArr.length; i3++) {
                InputFilter inputFilter = inputFilterArr[i3];
                if (inputFilter instanceof C0383e) {
                    sparseArray.put(i3, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (sparseArray.indexOfKey(i11) < 0) {
                    inputFilterArr2[i10] = inputFilterArr[i11];
                    i10++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i12 = 0;
        while (true) {
            C0383e c0383e = this.f9246g;
            if (i12 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = c0383e;
                return inputFilterArr3;
            }
            if (inputFilterArr[i12] == c0383e) {
                return inputFilterArr;
            }
            i12++;
        }
    }

    @Override // Y3.a
    public final boolean n() {
        return this.f9247h;
    }

    @Override // Y3.a
    public final void u(boolean z2) {
        if (z2) {
            TextView textView = this.f9245f;
            textView.setTransformationMethod(D(textView.getTransformationMethod()));
        }
    }

    @Override // Y3.a
    public final void x(boolean z2) {
        this.f9247h = z2;
        TextView textView = this.f9245f;
        textView.setTransformationMethod(D(textView.getTransformationMethod()));
        textView.setFilters(l(textView.getFilters()));
    }
}
