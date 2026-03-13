package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class DropDownPreference extends ListPreference {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayAdapter f9984k;

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130903325);
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_dropdown_item);
        this.f9984k = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.f9985h;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void b() {
        ArrayAdapter arrayAdapter = this.f9984k;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }
}
