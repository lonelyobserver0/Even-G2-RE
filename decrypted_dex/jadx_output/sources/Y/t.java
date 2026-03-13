package Y;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import com.stub.StubApp;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class t extends SpannableStringBuilder {

    /* renamed from: a, reason: collision with root package name */
    public final Class f8695a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f8696b;

    public t(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f8696b = new ArrayList();
        M.d.e(cls, StubApp.getString2(7491));
        this.f8695a = cls;
    }

    public final void a() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f8696b;
            if (i3 >= arrayList.size()) {
                return;
            }
            ((s) arrayList.get(i3)).f8694b.incrementAndGet();
            i3++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f8696b;
            if (i3 >= arrayList.size()) {
                return;
            }
            ((s) arrayList.get(i3)).onTextChanged(this, 0, length(), length());
            i3++;
        }
    }

    public final s c(Object obj) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f8696b;
            if (i3 >= arrayList.size()) {
                return null;
            }
            s sVar = (s) arrayList.get(i3);
            if (sVar.f8693a == obj) {
                return sVar;
            }
            i3++;
        }
    }

    public final boolean d(Object obj) {
        if (obj != null) {
            return this.f8695a == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i3, int i10) {
        super.delete(i3, i10);
        return this;
    }

    public final void e() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f8696b;
            if (i3 >= arrayList.size()) {
                return;
            }
            ((s) arrayList.get(i3)).f8694b.decrementAndGet();
            i3++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        s c10;
        if (d(obj) && (c10 = c(obj)) != null) {
            obj = c10;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        s c10;
        if (d(obj) && (c10 = c(obj)) != null) {
            obj = c10;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        s c10;
        if (d(obj) && (c10 = c(obj)) != null) {
            obj = c10;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i3, int i10, Class cls) {
        if (this.f8695a != cls) {
            return super.getSpans(i3, i10, cls);
        }
        s[] sVarArr = (s[]) super.getSpans(i3, i10, s.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, sVarArr.length);
        for (int i11 = 0; i11 < sVarArr.length; i11++) {
            objArr[i11] = sVarArr[i11].f8693a;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i3, CharSequence charSequence) {
        super.insert(i3, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i3, int i10, Class cls) {
        if (cls == null || this.f8695a == cls) {
            cls = s.class;
        }
        return super.nextSpanTransition(i3, i10, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        s sVar;
        if (d(obj)) {
            sVar = c(obj);
            if (sVar != null) {
                obj = sVar;
            }
        } else {
            sVar = null;
        }
        super.removeSpan(obj);
        if (sVar != null) {
            this.f8696b.remove(sVar);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i3, int i10, CharSequence charSequence) {
        replace(i3, i10, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i3, int i10, int i11) {
        if (d(obj)) {
            s sVar = new s(obj);
            this.f8696b.add(sVar);
            obj = sVar;
        }
        super.setSpan(obj, i3, i10, i11);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i3, int i10) {
        return new t(this.f8695a, this, i3, i10);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i3, int i10) {
        super.delete(i3, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i3, CharSequence charSequence) {
        super.insert(i3, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i3, int i10, CharSequence charSequence, int i11, int i12) {
        replace(i3, i10, charSequence, i11, i12);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i3, CharSequence charSequence, int i10, int i11) {
        super.insert(i3, charSequence, i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i3, int i10, CharSequence charSequence) {
        a();
        super.replace(i3, i10, charSequence);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c10) {
        super.append(c10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i3, CharSequence charSequence, int i10, int i11) {
        super.insert(i3, charSequence, i10, i11);
        return this;
    }

    public t(Class cls, t tVar, int i3, int i10) {
        super(tVar, i3, i10);
        this.f8696b = new ArrayList();
        M.d.e(cls, StubApp.getString2(7491));
        this.f8695a = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c10) {
        super.append(c10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c10) {
        super.append(c10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i3, int i10, CharSequence charSequence, int i11, int i12) {
        a();
        super.replace(i3, i10, charSequence, i11, i12);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i3, int i10) {
        super.append(charSequence, i3, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i3, int i10) {
        super.append(charSequence, i3, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i3, int i10) {
        super.append(charSequence, i3, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i3) {
        super.append(charSequence, obj, i3);
        return this;
    }
}
