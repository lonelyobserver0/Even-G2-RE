package X2;

import com.stub.StubApp;
import hb.C1014a;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import sb.EnumC1611A;
import sb.EnumC1612B;
import sb.EnumC1655k;
import sb.EnumC1671s;
import sb.F0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class g extends StandardMessageCodec {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8275a;

    public /* synthetic */ g(int i3) {
        this.f8275a = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v38, types: [X2.x[]] */
    /* JADX WARN: Type inference failed for: r2v39, types: [X2.j[]] */
    /* JADX WARN: Type inference failed for: r6v6, types: [X2.x] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [X2.j] */
    @Override // io.flutter.plugin.common.StandardMessageCodec
    public Object readValueOfType(byte b2, ByteBuffer buffer) {
        Object lVar;
        Object obj;
        switch (this.f8275a) {
            case 0:
                Intrinsics.checkNotNullParameter(buffer, "buffer");
                int i3 = 0;
                if (b2 != -127) {
                    if (b2 != -126) {
                        String string2 = StubApp.getString2(7074);
                        if (b2 != -125) {
                            String string22 = StubApp.getString2(7075);
                            if (b2 != -124) {
                                if (b2 != -123) {
                                    if (b2 != -122) {
                                        if (b2 != -121) {
                                            break;
                                        } else {
                                            Object readValue = readValue(buffer);
                                            List list = readValue instanceof List ? (List) readValue : null;
                                            if (list != null) {
                                                Intrinsics.checkNotNullParameter(list, string2);
                                                Object obj2 = list.get(0);
                                                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                                                String str = (String) obj2;
                                                Object obj3 = list.get(1);
                                                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
                                                String str2 = (String) obj3;
                                                Object obj4 = list.get(2);
                                                Intrinsics.checkNotNull(obj4, string22);
                                                double doubleValue = ((Double) obj4).doubleValue();
                                                Object obj5 = list.get(3);
                                                Intrinsics.checkNotNull(obj5, string22);
                                                double doubleValue2 = ((Double) obj5).doubleValue();
                                                Object obj6 = list.get(4);
                                                Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.String");
                                                lVar = new l(str, str2, doubleValue, doubleValue2, (String) obj6, (Long) list.get(5), (List) list.get(6), (String) list.get(7));
                                            }
                                        }
                                    } else {
                                        Object readValue2 = readValue(buffer);
                                        List list2 = readValue2 instanceof List ? (List) readValue2 : null;
                                        if (list2 != null) {
                                            Intrinsics.checkNotNullParameter(list2, string2);
                                            Object obj7 = list2.get(0);
                                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                                            lVar = new h(((Boolean) obj7).booleanValue(), (Long) list2.get(1), (Long) list2.get(2), (Long) list2.get(3), (Double) list2.get(4), (Double) list2.get(5), (String) list2.get(6), (Long) list2.get(7), (x) list2.get(8), (x) list2.get(9));
                                        }
                                    }
                                } else {
                                    Object readValue3 = readValue(buffer);
                                    List list3 = readValue3 instanceof List ? (List) readValue3 : null;
                                    if (list3 != null) {
                                        Intrinsics.checkNotNullParameter(list3, string2);
                                        Object obj8 = list3.get(0);
                                        Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type com.even.navigate.EvenTravelMode");
                                        break;
                                    }
                                }
                            } else {
                                Object readValue4 = readValue(buffer);
                                List list4 = readValue4 instanceof List ? (List) readValue4 : null;
                                if (list4 != null) {
                                    Intrinsics.checkNotNullParameter(list4, string2);
                                    Object obj9 = list4.get(0);
                                    Intrinsics.checkNotNull(obj9, string22);
                                    double doubleValue3 = ((Double) obj9).doubleValue();
                                    Object obj10 = list4.get(1);
                                    Intrinsics.checkNotNull(obj10, string22);
                                    break;
                                }
                            }
                        } else {
                            Object readValue5 = readValue(buffer);
                            List list5 = readValue5 instanceof List ? (List) readValue5 : null;
                            if (list5 != null) {
                                Intrinsics.checkNotNullParameter(list5, string2);
                                lVar = new f((e) list5.get(0), (Long) list5.get(1), (Double) list5.get(2), (Double) list5.get(3), (Double) list5.get(4), (Double) list5.get(5), (Double) list5.get(6), (Double) list5.get(7), (Double) list5.get(8), (Long) list5.get(9));
                                break;
                            }
                        }
                    } else {
                        Long l9 = (Long) readValue(buffer);
                        if (l9 != null) {
                            int longValue = (int) l9.longValue();
                            x.f8347b.getClass();
                            ?? values = x.values();
                            int length = values.length;
                            while (i3 < length) {
                                obj = values[i3];
                                if (obj.f8368a != longValue) {
                                    i3++;
                                }
                            }
                            break;
                        }
                    }
                } else {
                    Long l10 = (Long) readValue(buffer);
                    if (l10 != null) {
                        int longValue2 = (int) l10.longValue();
                        j.f8288b.getClass();
                        ?? values2 = j.values();
                        int length2 = values2.length;
                        while (i3 < length2) {
                            obj = values2[i3];
                            if (obj.f8293a == longValue2) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                        break;
                    }
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(buffer, "buffer");
                if (b2 != -127) {
                    break;
                } else {
                    Object readValue6 = readValue(buffer);
                    List pigeonVar_list = readValue6 instanceof List ? (List) readValue6 : null;
                    if (pigeonVar_list != null) {
                        Intrinsics.checkNotNullParameter(pigeonVar_list, "pigeonVar_list");
                        Object obj11 = pigeonVar_list.get(0);
                        Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type kotlin.String");
                        break;
                    }
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(buffer, "buffer");
                int i10 = 0;
                if (b2 != -127) {
                    if (b2 != -126) {
                        if (b2 != -125) {
                            if (b2 != -124) {
                                if (b2 != -123) {
                                    break;
                                } else {
                                    Long l11 = (Long) readValue(buffer);
                                    if (l11 != null) {
                                        int longValue3 = (int) l11.longValue();
                                        EnumC1611A.f20840b.getClass();
                                        EnumC1611A[] values3 = EnumC1611A.values();
                                        int length3 = values3.length;
                                        while (i10 < length3) {
                                            EnumC1611A enumC1611A = values3[i10];
                                            if (enumC1611A.f20843a == longValue3) {
                                                break;
                                            } else {
                                                i10++;
                                            }
                                        }
                                        break;
                                    }
                                }
                            } else {
                                Long l12 = (Long) readValue(buffer);
                                if (l12 != null) {
                                    int longValue4 = (int) l12.longValue();
                                    F0.f20855b.getClass();
                                    F0[] values4 = F0.values();
                                    int length4 = values4.length;
                                    while (i10 < length4) {
                                        F0 f02 = values4[i10];
                                        if (f02.f20864a == longValue4) {
                                            break;
                                        } else {
                                            i10++;
                                        }
                                    }
                                    break;
                                }
                            }
                        } else {
                            Long l13 = (Long) readValue(buffer);
                            if (l13 != null) {
                                int longValue5 = (int) l13.longValue();
                                EnumC1612B.f20848b.getClass();
                                EnumC1612B[] values5 = EnumC1612B.values();
                                int length5 = values5.length;
                                while (i10 < length5) {
                                    EnumC1612B enumC1612B = values5[i10];
                                    if (enumC1612B.f20852a == longValue5) {
                                        break;
                                    } else {
                                        i10++;
                                    }
                                }
                                break;
                            }
                        }
                    } else {
                        Long l14 = (Long) readValue(buffer);
                        if (l14 != null) {
                            int longValue6 = (int) l14.longValue();
                            EnumC1655k.f20961b.getClass();
                            EnumC1655k[] values6 = EnumC1655k.values();
                            int length6 = values6.length;
                            while (i10 < length6) {
                                EnumC1655k enumC1655k = values6[i10];
                                if (enumC1655k.f20969a == longValue6) {
                                    break;
                                } else {
                                    i10++;
                                }
                            }
                            break;
                        }
                    }
                } else {
                    Long l15 = (Long) readValue(buffer);
                    if (l15 != null) {
                        int longValue7 = (int) l15.longValue();
                        EnumC1671s.f20988b.getClass();
                        EnumC1671s[] values7 = EnumC1671s.values();
                        int length7 = values7.length;
                        while (i10 < length7) {
                            EnumC1671s enumC1671s = values7[i10];
                            if (enumC1671s.f20995a == longValue7) {
                                break;
                            } else {
                                i10++;
                            }
                        }
                        break;
                    }
                }
                break;
        }
        return super.readValueOfType(b2, buffer);
    }

    @Override // io.flutter.plugin.common.StandardMessageCodec
    public void writeValue(ByteArrayOutputStream stream, Object obj) {
        switch (this.f8275a) {
            case 0:
                Intrinsics.checkNotNullParameter(stream, "stream");
                if (!(obj instanceof j)) {
                    if (!(obj instanceof x)) {
                        if (!(obj instanceof f)) {
                            if (!(obj instanceof e)) {
                                if (!(obj instanceof i)) {
                                    if (!(obj instanceof h)) {
                                        if (!(obj instanceof l)) {
                                            super.writeValue(stream, obj);
                                            break;
                                        } else {
                                            stream.write(135);
                                            l lVar = (l) obj;
                                            writeValue(stream, CollectionsKt.listOf(lVar.f8297a, lVar.f8298b, Double.valueOf(lVar.f8299c), Double.valueOf(lVar.f8300d), lVar.f8301e, lVar.f8302f, lVar.f8303g, lVar.f8304h));
                                            break;
                                        }
                                    } else {
                                        stream.write(134);
                                        h hVar = (h) obj;
                                        writeValue(stream, CollectionsKt.listOf(Boolean.valueOf(hVar.f8276a), hVar.f8277b, hVar.f8278c, hVar.f8279d, hVar.f8280e, hVar.f8281f, hVar.f8282g, hVar.f8283h, hVar.f8284i, hVar.j));
                                        break;
                                    }
                                } else {
                                    stream.write(133);
                                    i iVar = (i) obj;
                                    writeValue(stream, CollectionsKt.listOf(iVar.f8285a, iVar.f8286b, iVar.f8287c));
                                    break;
                                }
                            } else {
                                stream.write(132);
                                e eVar = (e) obj;
                                writeValue(stream, CollectionsKt.listOf((Object[]) new Double[]{Double.valueOf(eVar.f8264a), Double.valueOf(eVar.f8265b)}));
                                break;
                            }
                        } else {
                            stream.write(131);
                            f fVar = (f) obj;
                            Double d8 = fVar.f8274i;
                            writeValue(stream, CollectionsKt.listOf(fVar.f8266a, fVar.f8267b, fVar.f8268c, fVar.f8269d, fVar.f8270e, fVar.f8271f, fVar.f8272g, fVar.f8273h, d8, fVar.j));
                            break;
                        }
                    } else {
                        stream.write(130);
                        writeValue(stream, Integer.valueOf(((x) obj).f8368a));
                        break;
                    }
                } else {
                    stream.write(129);
                    writeValue(stream, Integer.valueOf(((j) obj).f8293a));
                    break;
                }
            case 1:
                Intrinsics.checkNotNullParameter(stream, "stream");
                if (!(obj instanceof C1014a)) {
                    super.writeValue(stream, obj);
                    break;
                } else {
                    stream.write(129);
                    C1014a c1014a = (C1014a) obj;
                    writeValue(stream, CollectionsKt.listOf(c1014a.f14477a, c1014a.f14478b));
                    break;
                }
            default:
                Intrinsics.checkNotNullParameter(stream, "stream");
                if (!(obj instanceof EnumC1671s)) {
                    if (!(obj instanceof EnumC1655k)) {
                        if (!(obj instanceof EnumC1612B)) {
                            if (!(obj instanceof F0)) {
                                if (!(obj instanceof EnumC1611A)) {
                                    super.writeValue(stream, obj);
                                    break;
                                } else {
                                    stream.write(133);
                                    writeValue(stream, Integer.valueOf(((EnumC1611A) obj).f20843a));
                                    break;
                                }
                            } else {
                                stream.write(132);
                                writeValue(stream, Integer.valueOf(((F0) obj).f20864a));
                                break;
                            }
                        } else {
                            stream.write(131);
                            writeValue(stream, Integer.valueOf(((EnumC1612B) obj).f20852a));
                            break;
                        }
                    } else {
                        stream.write(130);
                        writeValue(stream, Integer.valueOf(((EnumC1655k) obj).f20969a));
                        break;
                    }
                } else {
                    stream.write(129);
                    writeValue(stream, Integer.valueOf(((EnumC1671s) obj).f20995a));
                    break;
                }
        }
    }
}
