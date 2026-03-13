package com.mapbox.maps;

import c5.B;
import com.mapbox.bindgen.DataRef;
import com.mapbox.maps.MapPlayerOptions;
import com.mapbox.maps.MapRecorderOptions;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J*\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000eH\u0007J\u0012\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\u0010H\u0007J\u0006\u0010\u0011\u001a\u00020\nJ\u0006\u0010\u0012\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/mapbox/maps/MapboxMapRecorder;", "", "mapRecorder", "Lcom/mapbox/maps/MapRecorder;", "(Lcom/mapbox/maps/MapRecorder;)V", "getPlaybackState", "", "replay", "", "recordedSequence", "Ljava/nio/ByteBuffer;", "options", "Lcom/mapbox/maps/MapPlayerOptions;", "onEnded", "Lkotlin/Function0;", "startRecording", "Lcom/mapbox/maps/MapRecorderOptions;", "stopRecording", "togglePauseReplay", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@MapboxExperimental
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MapboxMapRecorder {
    private final MapRecorder mapRecorder;

    public MapboxMapRecorder(MapRecorder mapRecorder) {
        Intrinsics.checkNotNullParameter(mapRecorder, "mapRecorder");
        this.mapRecorder = mapRecorder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void replay$default(MapboxMapRecorder mapboxMapRecorder, ByteBuffer byteBuffer, MapPlayerOptions mapPlayerOptions, Function0 function0, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            mapPlayerOptions = new MapPlayerOptions.Builder().build();
            Intrinsics.checkNotNullExpressionValue(mapPlayerOptions, "mapPlayerOptions");
        }
        if ((i3 & 4) != 0) {
            function0 = new Function0<Unit>() { // from class: com.mapbox.maps.MapboxMapRecorder$replay$2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
        }
        mapboxMapRecorder.replay(byteBuffer, mapPlayerOptions, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void replay$lambda$4(Function0 onEnded) {
        Intrinsics.checkNotNullParameter(onEnded, "$onEnded");
        onEnded.invoke();
    }

    public static /* synthetic */ void startRecording$default(MapboxMapRecorder mapboxMapRecorder, MapRecorderOptions mapRecorderOptions, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            mapRecorderOptions = new MapRecorderOptions.Builder().build();
            Intrinsics.checkNotNullExpressionValue(mapRecorderOptions, "Builder().apply(block).build()");
        }
        mapboxMapRecorder.startRecording(mapRecorderOptions);
    }

    public final String getPlaybackState() {
        String playbackState = this.mapRecorder.getPlaybackState();
        Intrinsics.checkNotNullExpressionValue(playbackState, "mapRecorder.playbackState");
        return playbackState;
    }

    @JvmOverloads
    public final void replay(ByteBuffer recordedSequence) {
        Intrinsics.checkNotNullParameter(recordedSequence, "recordedSequence");
        replay$default(this, recordedSequence, null, null, 6, null);
    }

    @JvmOverloads
    public final void startRecording() {
        startRecording$default(this, null, 1, null);
    }

    public final ByteBuffer stopRecording() {
        ByteBuffer buffer = this.mapRecorder.stopRecording().getBuffer();
        Intrinsics.checkNotNullExpressionValue(buffer, "data.buffer");
        buffer.rewind();
        return buffer;
    }

    public final void togglePauseReplay() {
        this.mapRecorder.togglePauseReplay();
    }

    @JvmOverloads
    public final void replay(ByteBuffer recordedSequence, MapPlayerOptions options) {
        Intrinsics.checkNotNullParameter(recordedSequence, "recordedSequence");
        Intrinsics.checkNotNullParameter(options, "options");
        replay$default(this, recordedSequence, options, null, 4, null);
    }

    @JvmOverloads
    public final void startRecording(MapRecorderOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.mapRecorder.startRecording(options);
    }

    @JvmOverloads
    public final void replay(ByteBuffer recordedSequence, MapPlayerOptions options, Function0<Unit> onEnded) {
        Intrinsics.checkNotNullParameter(recordedSequence, "recordedSequence");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(onEnded, "onEnded");
        DataRef allocateNative = DataRef.allocateNative(recordedSequence.limit());
        ByteBuffer buffer = allocateNative.getBuffer();
        recordedSequence.rewind();
        buffer.put(recordedSequence).rewind();
        this.mapRecorder.replay(allocateNative, options, new B(onEnded, 9));
    }
}
