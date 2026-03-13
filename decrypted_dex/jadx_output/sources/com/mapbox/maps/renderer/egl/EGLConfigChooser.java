package com.mapbox.maps.renderer.egl;

import E1.a;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.os.Build;
import com.mapbox.common.b;
import com.mapbox.maps.MapboxConstants;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.renderer.egl.EGLConfigChooser;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\b\u0001\u0018\u0000 \u001c2\u00020\u0001:\u0003\u001b\u001c\u001dB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ \u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u0018H\u0002J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u00182\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u0014\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/mapbox/maps/renderer/egl/EGLConfigChooser;", "", "translucentSurface", "", "antialiasingSampleCount", "", "mapName", "", "(ZILjava/lang/String;)V", "TAG", "getTAG$annotations", "()V", "antialiasingEnabled", "getAntialiasingEnabled", "()Z", "configAttributes", "", "getConfigAttributes", "()[I", "chooseBestMatchConfig", "Landroid/opengl/EGLConfig;", "display", "Landroid/opengl/EGLDisplay;", "configs", "", "chooseConfig", "getConfigs", "BufferFormat", "Companion", "DepthStencilFormat", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class EGLConfigChooser {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static int STENCIL_SIZE = 8;
    private final String TAG;
    private int antialiasingSampleCount;
    private final boolean translucentSurface;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/mapbox/maps/renderer/egl/EGLConfigChooser$BufferFormat;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "setValue", "(I)V", "Format32BitAlpha", "Format32BitNoAlpha", "Format24Bit", "Format16Bit", "Unknown", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum BufferFormat {
        Format32BitAlpha(0),
        Format32BitNoAlpha(1),
        Format24Bit(2),
        Format16Bit(3),
        Unknown(4);

        private int value;

        BufferFormat(int i3) {
            this.value = i3;
        }

        public final int getValue() {
            return this.value;
        }

        public final void setValue(int i3) {
            this.value = i3;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\b\fR$\u0010\u0003\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/mapbox/maps/renderer/egl/EGLConfigChooser$Companion;", "", "()V", "STENCIL_SIZE", "", "getSTENCIL_SIZE$maps_sdk_release$annotations", "getSTENCIL_SIZE$maps_sdk_release", "()I", "setSTENCIL_SIZE$maps_sdk_release", "(I)V", "inEmulator", "", "inEmulator$maps_sdk_release", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getSTENCIL_SIZE$maps_sdk_release$annotations() {
        }

        public final int getSTENCIL_SIZE$maps_sdk_release() {
            return EGLConfigChooser.STENCIL_SIZE;
        }

        public final boolean inEmulator$maps_sdk_release() {
            boolean contains$default;
            boolean contains$default2;
            boolean contains$default3;
            boolean contains$default4;
            String FINGERPRINT = Build.FINGERPRINT;
            Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
            String string2 = StubApp.getString2(5879);
            if (StringsKt.O(FINGERPRINT, string2)) {
                return true;
            }
            Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
            if (StringsKt.O(FINGERPRINT, StubApp.getString2(351))) {
                return true;
            }
            String MODEL = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
            String string22 = StubApp.getString2(5882);
            contains$default = StringsKt__StringsKt.contains$default(MODEL, (CharSequence) string22, false, 2, (Object) null);
            if (contains$default) {
                return true;
            }
            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
            contains$default2 = StringsKt__StringsKt.contains$default(MODEL, (CharSequence) StubApp.getString2(5883), false, 2, (Object) null);
            if (contains$default2) {
                return true;
            }
            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
            contains$default3 = StringsKt__StringsKt.contains$default(MODEL, (CharSequence) StubApp.getString2(5884), false, 2, (Object) null);
            if (contains$default3) {
                return true;
            }
            String BRAND = Build.BRAND;
            Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
            if (StringsKt.O(BRAND, string2)) {
                return true;
            }
            String DEVICE = Build.DEVICE;
            Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
            if (StringsKt.O(DEVICE, string2) || Intrinsics.areEqual(Build.PRODUCT, string22)) {
                return true;
            }
            String MANUFACTURER = Build.MANUFACTURER;
            Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
            contains$default4 = StringsKt__StringsKt.contains$default(MANUFACTURER, (CharSequence) StubApp.getString2(5885), false, 2, (Object) null);
            return contains$default4 || System.getProperty(StubApp.getString2(14532)) != null;
        }

        public final void setSTENCIL_SIZE$maps_sdk_release(int i3) {
            EGLConfigChooser.STENCIL_SIZE = i3;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/mapbox/maps/renderer/egl/EGLConfigChooser$DepthStencilFormat;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "setValue", "(I)V", "Format24Depth8Stencil", "Format16Depth8Stencil", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum DepthStencilFormat {
        Format24Depth8Stencil(0),
        Format16Depth8Stencil(1);

        private int value;

        DepthStencilFormat(int i3) {
            this.value = i3;
        }

        public final int getValue() {
            return this.value;
        }

        public final void setValue(int i3) {
            this.value = i3;
        }
    }

    public EGLConfigChooser(boolean z2, int i3, String mapName) {
        Intrinsics.checkNotNullParameter(mapName, "mapName");
        this.translucentSurface = z2;
        this.antialiasingSampleCount = i3;
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(14535));
        sb2.append(!StringsKt.isBlank(mapName) ? a.j(StubApp.getString2(639), mapName) : "");
        this.TAG = sb2.toString();
    }

    private final EGLConfig chooseBestMatchConfig(EGLDisplay display, List<? extends EGLConfig> configs) {
        boolean z2;
        EGLDisplay eGLDisplay = display;
        ArrayList arrayList = new ArrayList();
        Iterator<? extends EGLConfig> it = configs.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            final EGLConfig next = it.next();
            final int i10 = i3 + 1;
            Integer chooseBestMatchConfig$getConfigAttr = chooseBestMatchConfig$getConfigAttr(eGLDisplay, next, this, 12327);
            if (chooseBestMatchConfig$getConfigAttr == null) {
                return null;
            }
            int intValue = chooseBestMatchConfig$getConfigAttr.intValue();
            Integer chooseBestMatchConfig$getConfigAttr2 = chooseBestMatchConfig$getConfigAttr(eGLDisplay, next, this, 12354);
            if (chooseBestMatchConfig$getConfigAttr2 == null) {
                return null;
            }
            int intValue2 = chooseBestMatchConfig$getConfigAttr2.intValue();
            Integer chooseBestMatchConfig$getConfigAttr3 = chooseBestMatchConfig$getConfigAttr(eGLDisplay, next, this, 12320);
            if (chooseBestMatchConfig$getConfigAttr3 == null) {
                return null;
            }
            int intValue3 = chooseBestMatchConfig$getConfigAttr3.intValue();
            Integer chooseBestMatchConfig$getConfigAttr4 = chooseBestMatchConfig$getConfigAttr(eGLDisplay, next, this, 12324);
            if (chooseBestMatchConfig$getConfigAttr4 == null) {
                return null;
            }
            int intValue4 = chooseBestMatchConfig$getConfigAttr4.intValue();
            Integer chooseBestMatchConfig$getConfigAttr5 = chooseBestMatchConfig$getConfigAttr(eGLDisplay, next, this, 12323);
            if (chooseBestMatchConfig$getConfigAttr5 == null) {
                return null;
            }
            int intValue5 = chooseBestMatchConfig$getConfigAttr5.intValue();
            Integer chooseBestMatchConfig$getConfigAttr6 = chooseBestMatchConfig$getConfigAttr(eGLDisplay, next, this, 12322);
            if (chooseBestMatchConfig$getConfigAttr6 == null) {
                return null;
            }
            int intValue6 = chooseBestMatchConfig$getConfigAttr6.intValue();
            Integer chooseBestMatchConfig$getConfigAttr7 = chooseBestMatchConfig$getConfigAttr(eGLDisplay, next, this, 12321);
            if (chooseBestMatchConfig$getConfigAttr7 == null) {
                return null;
            }
            int intValue7 = chooseBestMatchConfig$getConfigAttr7.intValue();
            Integer chooseBestMatchConfig$getConfigAttr8 = chooseBestMatchConfig$getConfigAttr(eGLDisplay, next, this, 12325);
            if (chooseBestMatchConfig$getConfigAttr8 != null) {
                int intValue8 = chooseBestMatchConfig$getConfigAttr8.intValue();
                Integer chooseBestMatchConfig$getConfigAttr9 = chooseBestMatchConfig$getConfigAttr(eGLDisplay, next, this, 12326);
                if (chooseBestMatchConfig$getConfigAttr9 != null) {
                    int intValue9 = chooseBestMatchConfig$getConfigAttr9.intValue();
                    Integer chooseBestMatchConfig$getConfigAttr10 = chooseBestMatchConfig$getConfigAttr(eGLDisplay, next, this, 12338);
                    if (chooseBestMatchConfig$getConfigAttr10 != null) {
                        int intValue10 = chooseBestMatchConfig$getConfigAttr10.intValue();
                        Iterator<? extends EGLConfig> it2 = it;
                        Integer chooseBestMatchConfig$getConfigAttr11 = chooseBestMatchConfig$getConfigAttr(eGLDisplay, next, this, 12337);
                        if (chooseBestMatchConfig$getConfigAttr11 != null) {
                            final int intValue11 = chooseBestMatchConfig$getConfigAttr11.intValue();
                            boolean z10 = (intValue8 == 24 || intValue8 == 16) & (intValue9 == 8);
                            if (getAntialiasingEnabled()) {
                                z2 = (intValue11 >= this.antialiasingSampleCount) & z10 & (intValue10 >= 1);
                            } else {
                                z2 = z10 & (intValue10 == 0) & (intValue11 == 0);
                            }
                            if (z2) {
                                final BufferFormat bufferFormat = (intValue3 == 16 && intValue4 == 5 && intValue5 == 6 && intValue6 == 5 && intValue7 == 0) ? BufferFormat.Format16Bit : (intValue3 == 32 && intValue4 == 8 && intValue5 == 8 && intValue6 == 8 && intValue7 == 0) ? BufferFormat.Format32BitNoAlpha : (intValue3 == 32 && intValue4 == 8 && intValue5 == 8 && intValue6 == 8 && intValue7 == 8) ? BufferFormat.Format32BitAlpha : (intValue3 == 24 && intValue4 == 8 && intValue5 == 8 && intValue6 == 8 && intValue7 == 0) ? BufferFormat.Format24Bit : BufferFormat.Unknown;
                                if (bufferFormat != BufferFormat.Unknown) {
                                    final DepthStencilFormat depthStencilFormat = (intValue8 == 16 && intValue9 == 8) ? DepthStencilFormat.Format16Depth8Stencil : DepthStencilFormat.Format24Depth8Stencil;
                                    final boolean z11 = (intValue2 & 4) != 4;
                                    final boolean z12 = intValue != 12344;
                                    arrayList.add(new Comparable<EGLConfigChooser$chooseBestMatchConfig$Config>(bufferFormat, depthStencilFormat, z11, z12, i10, next, intValue11) { // from class: com.mapbox.maps.renderer.egl.EGLConfigChooser$chooseBestMatchConfig$Config
                                        private final EGLConfigChooser.BufferFormat bufferFormat;
                                        private final EGLConfig config;
                                        private final EGLConfigChooser.DepthStencilFormat depthStencilFormat;
                                        private final int index;
                                        private final boolean isCaveat;
                                        private final boolean isNotConformant;
                                        private final int samples;

                                        {
                                            Intrinsics.checkNotNullParameter(bufferFormat, "bufferFormat");
                                            Intrinsics.checkNotNullParameter(depthStencilFormat, "depthStencilFormat");
                                            Intrinsics.checkNotNullParameter(next, "config");
                                            this.bufferFormat = bufferFormat;
                                            this.depthStencilFormat = depthStencilFormat;
                                            this.isNotConformant = z11;
                                            this.isCaveat = z12;
                                            this.index = i10;
                                            this.config = next;
                                            this.samples = intValue11;
                                        }

                                        public final EGLConfigChooser.BufferFormat getBufferFormat() {
                                            return this.bufferFormat;
                                        }

                                        public final EGLConfig getConfig() {
                                            return this.config;
                                        }

                                        public final EGLConfigChooser.DepthStencilFormat getDepthStencilFormat() {
                                            return this.depthStencilFormat;
                                        }

                                        public final int getIndex() {
                                            return this.index;
                                        }

                                        public final int getSamples() {
                                            return this.samples;
                                        }

                                        /* renamed from: isCaveat, reason: from getter */
                                        public final boolean getIsCaveat() {
                                            return this.isCaveat;
                                        }

                                        /* renamed from: isNotConformant, reason: from getter */
                                        public final boolean getIsNotConformant() {
                                            return this.isNotConformant;
                                        }

                                        @Override // java.lang.Comparable
                                        public int compareTo(EGLConfigChooser$chooseBestMatchConfig$Config other) {
                                            Intrinsics.checkNotNullParameter(other, "other");
                                            int compare = Integer.compare(this.bufferFormat.getValue(), other.bufferFormat.getValue());
                                            if (compare != 0) {
                                                return compare;
                                            }
                                            int compare2 = Integer.compare(this.depthStencilFormat.getValue(), other.depthStencilFormat.getValue());
                                            if (compare2 != 0) {
                                                return compare2;
                                            }
                                            int compare3 = Boolean.compare(this.isNotConformant, other.isNotConformant);
                                            if (compare3 != 0) {
                                                return compare3;
                                            }
                                            int compare4 = Boolean.compare(this.isCaveat, other.isCaveat);
                                            if (compare4 != 0) {
                                                return compare4;
                                            }
                                            int compare5 = Integer.compare(this.index, other.index);
                                            if (compare5 != 0) {
                                                return compare5;
                                            }
                                            return 0;
                                        }
                                    });
                                }
                            }
                            eGLDisplay = display;
                            i3 = i10;
                            it = it2;
                        }
                    }
                }
            }
            return null;
        }
        if (arrayList.size() == 0) {
            MapboxLogger.logE(this.TAG, StubApp.getString2(14536));
            return null;
        }
        CollectionsKt.sort(arrayList);
        Object obj = arrayList.get(0);
        Intrinsics.checkNotNullExpressionValue(obj, "matches[0]");
        EGLConfigChooser$chooseBestMatchConfig$Config eGLConfigChooser$chooseBestMatchConfig$Config = (EGLConfigChooser$chooseBestMatchConfig$Config) obj;
        if (eGLConfigChooser$chooseBestMatchConfig$Config.getIsCaveat()) {
            MapboxLogger.logW(this.TAG, StubApp.getString2(14537));
        }
        if (eGLConfigChooser$chooseBestMatchConfig$Config.getIsNotConformant()) {
            MapboxLogger.logW(this.TAG, StubApp.getString2(14538));
        }
        if (getAntialiasingEnabled() && eGLConfigChooser$chooseBestMatchConfig$Config.getSamples() != this.antialiasingSampleCount) {
            MapboxLogger.logW(this.TAG, StubApp.getString2(14539) + this.antialiasingSampleCount + StubApp.getString2(14540) + eGLConfigChooser$chooseBestMatchConfig$Config.getSamples() + StubApp.getString2(14541));
        }
        return eGLConfigChooser$chooseBestMatchConfig$Config.getConfig();
    }

    private static final Integer chooseBestMatchConfig$getConfigAttr(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLConfigChooser eGLConfigChooser, int i3) {
        int[] iArr = new int[1];
        if (EGL14.eglGetConfigAttrib(eGLDisplay, eGLConfig, i3, iArr, 0)) {
            return Integer.valueOf(iArr[0]);
        }
        String str = eGLConfigChooser.TAG;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(MapboxConstants.getMAPBOX_LOCALE(), StubApp.getString2(14542), Arrays.copyOf(new Object[]{Integer.valueOf(i3), Integer.valueOf(EGL14.eglGetError())}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
        MapboxLogger.logE(str, format);
        return null;
    }

    private final boolean getAntialiasingEnabled() {
        return this.antialiasingSampleCount > 1;
    }

    private final int[] getConfigAttributes() {
        boolean inEmulator$maps_sdk_release = INSTANCE.inEmulator$maps_sdk_release();
        MapboxLogger.logI(this.TAG, StubApp.getString2(14543) + inEmulator$maps_sdk_release);
        return ArraysKt.plus(ArraysKt.plus(ArraysKt.plus(new int[]{12327, 12344, 12339, 4, 12320, 16, 12324, 5, 12323, 6, 12322, 5, 12321, this.translucentSurface ? 8 : 0, 12325, 16, 12326, STENCIL_SIZE, 12352, 4}, getAntialiasingEnabled() ? new int[]{12338, 1, 12337, this.antialiasingSampleCount} : new int[0]), inEmulator$maps_sdk_release ? new int[]{12354, 4, 12351, 12430} : new int[0]), 12344);
    }

    private final List<EGLConfig> getConfigs(EGLDisplay display) {
        int[] iArr = new int[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[100];
        int i3 = this.antialiasingSampleCount;
        boolean z2 = false;
        while (!z2) {
            EGLDisplay eGLDisplay = display;
            if (EGL14.eglChooseConfig(eGLDisplay, getConfigAttributes(), 0, eGLConfigArr, 0, 100, iArr, 0) && iArr[0] >= 1) {
                z2 = true;
            } else {
                if (this.antialiasingSampleCount <= 1) {
                    MapboxLogger.logE(this.TAG, StubApp.getString2(14545) + EGL14.eglGetError() + '.');
                    return CollectionsKt.emptyList();
                }
                MapboxLogger.logW(this.TAG, StubApp.getString2(14544) + this.antialiasingSampleCount + StubApp.getString2(2453));
                this.antialiasingSampleCount = this.antialiasingSampleCount / 2;
            }
            display = eGLDisplay;
        }
        int i10 = this.antialiasingSampleCount;
        if (i3 != i10) {
            MapboxLogger.logW(this.TAG, i10 == 1 ? StubApp.getString2(14546) : b.j(new StringBuilder(StubApp.getString2(14547)), this.antialiasingSampleCount, '.'));
        }
        return CollectionsKt.requireNoNulls(ArraysKt.take(eGLConfigArr, iArr[0]));
    }

    private static /* synthetic */ void getTAG$annotations() {
    }

    public final EGLConfig chooseConfig(EGLDisplay display) {
        Intrinsics.checkNotNullParameter(display, "display");
        EGLConfig chooseBestMatchConfig = chooseBestMatchConfig(display, getConfigs(display));
        if (chooseBestMatchConfig == null) {
            MapboxLogger.logE(this.TAG, StubApp.getString2(14548));
        }
        return chooseBestMatchConfig;
    }
}
