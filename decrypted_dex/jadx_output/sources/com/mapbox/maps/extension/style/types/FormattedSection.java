package com.mapbox.maps.extension.style.types;

import Xa.h;
import android.graphics.Color;
import android.util.Log;
import androidx.annotation.Keep;
import com.mapbox.bindgen.Value;
import com.stub.StubApp;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003JB\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0019HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\r\u0010*\u001a\u00020+H\u0000¢\u0006\u0002\b,R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0014\"\u0004\b\u0016\u0010\u0017R&\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\u0018\u001a\u00020\u00198G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006-"}, d2 = {"Lcom/mapbox/maps/extension/style/types/FormattedSection;", "", "text", "", "fontScale", "", "fontStack", "", "textColor", "(Ljava/lang/String;Ljava/lang/Double;Ljava/util/List;Ljava/lang/String;)V", "getFontScale", "()Ljava/lang/Double;", "setFontScale", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getFontStack", "()Ljava/util/List;", "setFontStack", "(Ljava/util/List;)V", "getText", "()Ljava/lang/String;", "getTextColor", "setTextColor", "(Ljava/lang/String;)V", "value", "", "textColorAsInt", "getTextColorAsInt", "()I", "setTextColorAsInt", "(I)V", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Double;Ljava/util/List;Ljava/lang/String;)Lcom/mapbox/maps/extension/style/types/FormattedSection;", "equals", "", "other", "hashCode", "toString", "toValue", "Lcom/mapbox/bindgen/Value;", "toValue$extension_style_release", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* data */ class FormattedSection {
    private Double fontScale;
    private List<String> fontStack;
    private final String text;
    private String textColor;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FormattedSection(String text) {
        this(text, null, null, null, 14, null);
        Intrinsics.checkNotNullParameter(text, "text");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FormattedSection copy$default(FormattedSection formattedSection, String str, Double d8, List list, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = formattedSection.text;
        }
        if ((i3 & 2) != 0) {
            d8 = formattedSection.fontScale;
        }
        if ((i3 & 4) != 0) {
            list = formattedSection.fontStack;
        }
        if ((i3 & 8) != 0) {
            str2 = formattedSection.textColor;
        }
        return formattedSection.copy(str, d8, list, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final Double getFontScale() {
        return this.fontScale;
    }

    public final List<String> component3() {
        return this.fontStack;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    public final FormattedSection copy(String text, Double fontScale, List<String> fontStack, String textColor) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new FormattedSection(text, fontScale, fontStack, textColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormattedSection)) {
            return false;
        }
        FormattedSection formattedSection = (FormattedSection) other;
        return Intrinsics.areEqual(this.text, formattedSection.text) && Intrinsics.areEqual((Object) this.fontScale, (Object) formattedSection.fontScale) && Intrinsics.areEqual(this.fontStack, formattedSection.fontStack) && Intrinsics.areEqual(this.textColor, formattedSection.textColor);
    }

    public final Double getFontScale() {
        return this.fontScale;
    }

    public final List<String> getFontStack() {
        return this.fontStack;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public final int getTextColorAsInt() {
        Integer num;
        String value = this.textColor;
        if (value != null) {
            Intrinsics.checkNotNullParameter(value, "value");
            Matcher m4 = Pattern.compile(StubApp.getString2(14365)).matcher(value);
            Intrinsics.checkNotNullExpressionValue(m4, "m");
            if (m4.matches() && m4.groupCount() == 4) {
                String group = m4.group(4);
                float parseFloat = group != null ? Float.parseFloat(group) : 1.0f;
                String group2 = m4.group(1);
                Intrinsics.checkNotNull(group2);
                int parseFloat2 = (int) Float.parseFloat(group2);
                String group3 = m4.group(2);
                Intrinsics.checkNotNull(group3);
                int parseFloat3 = (int) Float.parseFloat(group3);
                String group4 = m4.group(3);
                Intrinsics.checkNotNull(group4);
                num = Integer.valueOf(Color.argb((int) ((parseFloat * 255.0f) + 0.5f), parseFloat2, parseFloat3, (int) Float.parseFloat(group4)));
            } else {
                Log.e(StubApp.getString2(14366), StubApp.getString2(14367));
                num = null;
            }
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalStateException(StubApp.getString2(14368));
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        Double d8 = this.fontScale;
        int hashCode2 = (hashCode + (d8 == null ? 0 : d8.hashCode())) * 31;
        List<String> list = this.fontStack;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.textColor;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final void setFontScale(Double d8) {
        this.fontScale = d8;
    }

    public final void setFontStack(List<String> list) {
        this.fontStack = list;
    }

    public final void setTextColor(String str) {
        this.textColor = str;
    }

    public final void setTextColorAsInt(int i3) {
        NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.US);
        Intrinsics.checkNotNull(numberInstance, "null cannot be cast to non-null type java.text.DecimalFormat");
        DecimalFormat decimalFormat = (DecimalFormat) numberInstance;
        decimalFormat.applyPattern(StubApp.getString2(6926));
        String format = decimalFormat.format(((i3 >> 24) & 255) / 255.0d);
        Intrinsics.checkNotNullExpressionValue(format, "decimalFormat.format(alpha)");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format2 = String.format(Locale.US, StubApp.getString2(14369), Arrays.copyOf(new Object[]{Integer.valueOf((i3 >> 16) & 255), Integer.valueOf((i3 >> 8) & 255), Integer.valueOf(i3 & 255), format}, 4));
        Intrinsics.checkNotNullExpressionValue(format2, "format(locale, format, *args)");
        this.textColor = format2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(14370));
        sb2.append(this.text);
        sb2.append(StubApp.getString2(14371));
        sb2.append(this.fontScale);
        sb2.append(StubApp.getString2(14372));
        sb2.append(this.fontStack);
        sb2.append(StubApp.getString2(12795));
        return h.s(sb2, this.textColor, ')');
    }

    public final Value toValue$extension_style_release() {
        HashMap hashMap = new HashMap();
        Double d8 = this.fontScale;
        if (d8 != null) {
            hashMap.put(StubApp.getString2(14373), new Value(d8.doubleValue()));
        }
        List<String> list = this.fontStack;
        if (list != null) {
            ArrayList arrayList = new ArrayList(CollectionsKt.f(list));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new Value((String) it.next()));
            }
            hashMap.put(StubApp.getString2(14374), new Value((List<Value>) arrayList));
        }
        String str = this.textColor;
        if (str != null) {
            hashMap.put(StubApp.getString2(8546), new Value(str));
        }
        return new Value((List<Value>) CollectionsKt.listOf((Object[]) new Value[]{new Value(this.text), new Value((HashMap<String, Value>) hashMap)}));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FormattedSection(String text, Double d8) {
        this(text, d8, null, null, 12, null);
        Intrinsics.checkNotNullParameter(text, "text");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FormattedSection(String text, Double d8, List<String> list) {
        this(text, d8, list, null, 8, null);
        Intrinsics.checkNotNullParameter(text, "text");
    }

    @JvmOverloads
    public FormattedSection(String text, Double d8, List<String> list, String str) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.fontScale = d8;
        this.fontStack = list;
        this.textColor = str;
    }

    public /* synthetic */ FormattedSection(String str, Double d8, List list, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? null : d8, (i3 & 4) != 0 ? null : list, (i3 & 8) != 0 ? null : str2);
    }
}
