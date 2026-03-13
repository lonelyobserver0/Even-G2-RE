package com.mapbox.common;

import android.os.Debug;
import com.mapbox.bindgen.Value;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\f\u0010\u0006\u001a\u00020\u0007*\u00020\bH\u0002¨\u0006\n"}, d2 = {"Lcom/mapbox/common/MemoryMetricsSource;", "Lcom/mapbox/common/MetricsSource;", "()V", "getMetrics", "", "Lcom/mapbox/common/Metrics;", "toMetricValue", "Lcom/mapbox/bindgen/Value;", "", "Companion", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MemoryMetricsSource implements MetricsSource {
    private static final String prefix = StubApp.getString2(13380);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<MemoryMetricsSource> instance$delegate = LazyKt.lazy(new Function0<MemoryMetricsSource>() { // from class: com.mapbox.common.MemoryMetricsSource$Companion$instance$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final MemoryMetricsSource invoke() {
            return new MemoryMetricsSource(null);
        }
    });

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/mapbox/common/MemoryMetricsSource$Companion;", "", "()V", "instance", "Lcom/mapbox/common/MemoryMetricsSource;", "getInstance", "()Lcom/mapbox/common/MemoryMetricsSource;", "instance$delegate", "Lkotlin/Lazy;", "prefix", "", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MemoryMetricsSource getInstance() {
            return (MemoryMetricsSource) MemoryMetricsSource.instance$delegate.getValue();
        }

        private Companion() {
        }
    }

    public /* synthetic */ MemoryMetricsSource(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final Value toMetricValue(String str) {
        try {
            return ValueUtilsKt.toValue(Integer.valueOf(Integer.parseInt(str)));
        } catch (NumberFormatException unused) {
            return ValueUtilsKt.toValue(str);
        }
    }

    @Override // com.mapbox.common.MetricsSource
    public List<Metrics> getMetrics() {
        Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
        Debug.getMemoryInfo(memoryInfo);
        Map<String, String> memoryStats = memoryInfo.getMemoryStats();
        Intrinsics.checkNotNullExpressionValue(memoryStats, "memInfo.memoryStats");
        ArrayList arrayList = new ArrayList(memoryStats.size());
        for (Map.Entry<String, String> entry : memoryStats.entrySet()) {
            String str = StubApp.getString2(13380) + entry.getKey();
            String value = entry.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "it.value");
            arrayList.add(new Metrics(str, toMetricValue(value)));
        }
        return arrayList;
    }

    private MemoryMetricsSource() {
    }
}
