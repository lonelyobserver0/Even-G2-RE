package com.mapbox.common;

import android.os.BaseBundle;
import android.os.Bundle;
import com.mapbox.bindgen.Value;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u001a\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\n\u0010\u0006\u001a\u00020\u0003*\u00020\u0007\u001a\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u0005H\u0002\u001a\u0011\u0010\u0006\u001a\u00020\u0003*\u0004\u0018\u00010\b¢\u0006\u0002\u0010\t\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0002\u0010\f\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0002\u0010\u000e\u001a\u0011\u0010\u0006\u001a\u00020\u0003*\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010\u001a\u0011\u0010\u0006\u001a\u00020\u0003*\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012\u001a\f\u0010\u0006\u001a\u00020\u0003*\u0004\u0018\u00010\u0001\u001a*\u0010\u0006\u001a\u00020\u0003*\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0013j\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0014\u001a\u0012\u0010\u0006\u001a\u00020\u0003*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"TAG", "", "arrayToValue", "Lcom/mapbox/bindgen/Value;", "array", "", "toValue", "Landroid/os/BaseBundle;", "", "(Ljava/lang/Boolean;)Lcom/mapbox/bindgen/Value;", "", "requireIsFinite", "(Ljava/lang/Double;Z)Lcom/mapbox/bindgen/Value;", "", "(Ljava/lang/Float;Z)Lcom/mapbox/bindgen/Value;", "", "(Ljava/lang/Integer;)Lcom/mapbox/bindgen/Value;", "", "(Ljava/lang/Long;)Lcom/mapbox/bindgen/Value;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "", "common_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class ValueUtilsKt {
    private static final String TAG = StubApp.getString2(13543);

    private static final Value arrayToValue(Object obj) {
        ArrayList arrayList;
        int i3 = 0;
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            arrayList = new ArrayList(zArr.length);
            int length = zArr.length;
            while (i3 < length) {
                arrayList.add(Value.valueOf(zArr[i3]));
                i3++;
            }
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            arrayList = new ArrayList(bArr.length);
            int length2 = bArr.length;
            while (i3 < length2) {
                arrayList.add(Value.valueOf(bArr[i3]));
                i3++;
            }
        } else if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            arrayList = new ArrayList(iArr.length);
            int length3 = iArr.length;
            while (i3 < length3) {
                arrayList.add(Value.valueOf(iArr[i3]));
                i3++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            arrayList = new ArrayList(jArr.length);
            int length4 = jArr.length;
            while (i3 < length4) {
                arrayList.add(Value.valueOf(jArr[i3]));
                i3++;
            }
        } else if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            arrayList = new ArrayList(fArr.length);
            int length5 = fArr.length;
            while (i3 < length5) {
                arrayList.add(Value.valueOf(fArr[i3]));
                i3++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            arrayList = new ArrayList(dArr.length);
            int length6 = dArr.length;
            while (i3 < length6) {
                arrayList.add(Value.valueOf(dArr[i3]));
                i3++;
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        return Value.valueOf(arrayList);
    }

    public static final Value toValue(BaseBundle baseBundle) {
        Intrinsics.checkNotNullParameter(baseBundle, "<this>");
        HashMap hashMap = new HashMap();
        boolean isEmpty = baseBundle.isEmpty();
        String string2 = StubApp.getString2(13542);
        if (isEmpty) {
            Value valueOf = Value.valueOf((HashMap<String, Value>) hashMap);
            Intrinsics.checkNotNullExpressionValue(valueOf, string2);
            return valueOf;
        }
        for (String str : baseBundle.keySet()) {
            Object obj = baseBundle.get(str);
            if (obj != null) {
                if ((obj instanceof Bundle) && Intrinsics.areEqual(obj, baseBundle)) {
                    Log.warning(StubApp.getString2(13543), StubApp.getString2(13544));
                } else {
                    Value value = toValue(obj);
                    if (value != null) {
                    }
                }
            }
        }
        Value valueOf2 = Value.valueOf((HashMap<String, Value>) hashMap);
        Intrinsics.checkNotNullExpressionValue(valueOf2, string2);
        return valueOf2;
    }

    public static /* synthetic */ Value toValue$default(Float f10, boolean z2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z2 = true;
        }
        return toValue(f10, z2);
    }

    public static /* synthetic */ Value toValue$default(Double d8, boolean z2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z2 = true;
        }
        return toValue(d8, z2);
    }

    public static final Value toValue(String str) {
        if (str != null) {
            Value valueOf = Value.valueOf(str);
            Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this)");
            return valueOf;
        }
        Value nullValue = Value.nullValue();
        Intrinsics.checkNotNullExpressionValue(nullValue, "nullValue()");
        return nullValue;
    }

    public static final Value toValue(Boolean bool) {
        if (bool != null) {
            Value valueOf = Value.valueOf(bool.booleanValue());
            Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(it)");
            return valueOf;
        }
        Value nullValue = Value.nullValue();
        Intrinsics.checkNotNullExpressionValue(nullValue, "nullValue()");
        return nullValue;
    }

    public static final Value toValue(Integer num) {
        if (num != null) {
            Value valueOf = Value.valueOf(num.intValue());
            Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(it.toLong())");
            return valueOf;
        }
        Value nullValue = Value.nullValue();
        Intrinsics.checkNotNullExpressionValue(nullValue, "nullValue()");
        return nullValue;
    }

    public static final Value toValue(Long l9) {
        if (l9 != null) {
            Value valueOf = Value.valueOf(l9.longValue());
            Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(it)");
            return valueOf;
        }
        Value nullValue = Value.nullValue();
        Intrinsics.checkNotNullExpressionValue(nullValue, "nullValue()");
        return nullValue;
    }

    public static final Value toValue(Float f10, boolean z2) {
        if (f10 != null) {
            float floatValue = f10.floatValue();
            if (z2) {
                float floatValue2 = f10.floatValue();
                if (Float.isInfinite(floatValue2) || Float.isNaN(floatValue2)) {
                    throw new IllegalArgumentException(StubApp.getString2(8282));
                }
            }
            Value valueOf = Value.valueOf(floatValue);
            Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(it.toDouble())");
            return valueOf;
        }
        Value nullValue = Value.nullValue();
        Intrinsics.checkNotNullExpressionValue(nullValue, "nullValue()");
        return nullValue;
    }

    public static final Value toValue(Double d8, boolean z2) {
        if (d8 != null) {
            double doubleValue = d8.doubleValue();
            if (z2) {
                double doubleValue2 = d8.doubleValue();
                if (Double.isInfinite(doubleValue2) || Double.isNaN(doubleValue2)) {
                    throw new IllegalArgumentException(StubApp.getString2(8283));
                }
            }
            Value valueOf = Value.valueOf(doubleValue);
            Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(it)");
            return valueOf;
        }
        Value nullValue = Value.nullValue();
        Intrinsics.checkNotNullExpressionValue(nullValue, "nullValue()");
        return nullValue;
    }

    public static final Value toValue(List<? extends Value> list) {
        if (list != null) {
            Value valueOf = Value.valueOf((List<Value>) list);
            Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this)");
            return valueOf;
        }
        Value nullValue = Value.nullValue();
        Intrinsics.checkNotNullExpressionValue(nullValue, "nullValue()");
        return nullValue;
    }

    public static final Value toValue(HashMap<String, Value> hashMap) {
        if (hashMap != null) {
            Value valueOf = Value.valueOf(hashMap);
            Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this)");
            return valueOf;
        }
        Value nullValue = Value.nullValue();
        Intrinsics.checkNotNullExpressionValue(nullValue, "nullValue()");
        return nullValue;
    }

    private static final Value toValue(Object obj) {
        if (obj instanceof Byte) {
            return Value.valueOf(((Number) obj).byteValue());
        }
        if (obj instanceof Integer) {
            return Value.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return Value.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof Float) {
            return Value.valueOf(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return Value.valueOf(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return Value.valueOf(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return Value.valueOf((String) obj);
        }
        if (obj instanceof boolean[] ? true : obj instanceof byte[] ? true : obj instanceof int[] ? true : obj instanceof long[] ? true : obj instanceof float[] ? true : obj instanceof double[]) {
            return arrayToValue(obj);
        }
        if (obj instanceof Bundle) {
            return toValue((BaseBundle) obj);
        }
        Log.warning(StubApp.getString2(13543), StubApp.getString2(13545) + obj.getClass().getCanonicalName());
        return null;
    }
}
