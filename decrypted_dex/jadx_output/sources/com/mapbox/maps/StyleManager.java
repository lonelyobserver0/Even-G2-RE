package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.bindgen.Value;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.Cancelable;
import com.mapbox.geojson.Feature;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.util.HashMap;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class StyleManager extends Observable {

    public static class StyleManagerPeerCleaner implements Runnable {
        private long peer;

        public StyleManagerPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            StyleManager.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public StyleManager(long j) {
        super(0L);
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    public static native StylePropertyValue getStyleLayerPropertyDefaultValue(String str, String str2);

    public static native StylePropertyValue getStyleSourcePropertyDefaultValue(String str, String str2);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new StyleManagerPeerCleaner(j));
    }

    public native Expected<String, None> addGeoJSONSourceFeatures(String str, String str2, List<Feature> list);

    public native Expected<String, None> addPersistentStyleCustomLayer(String str, CustomLayerHost customLayerHost, LayerPosition layerPosition);

    public native Expected<String, None> addPersistentStyleLayer(Value value, LayerPosition layerPosition);

    public native Expected<String, None> addStyleCustomGeometrySource(String str, CustomGeometrySourceOptions customGeometrySourceOptions);

    public native Expected<String, None> addStyleCustomLayer(String str, CustomLayerHost customLayerHost, LayerPosition layerPosition);

    public native Expected<String, None> addStyleCustomRasterSource(String str, CustomRasterSourceOptions customRasterSourceOptions);

    public native Expected<String, None> addStyleImage(String str, float f10, Image image, boolean z2, List<ImageStretches> list, List<ImageStretches> list2, ImageContent imageContent);

    public native Expected<String, None> addStyleImportFromJSON(String str, String str2, HashMap<String, Value> hashMap, ImportPosition importPosition);

    public native Expected<String, None> addStyleImportFromURI(String str, String str2, HashMap<String, Value> hashMap, ImportPosition importPosition);

    public native Expected<String, None> addStyleLayer(Value value, LayerPosition layerPosition);

    public native Expected<String, None> addStyleModel(String str, String str2);

    public native Expected<String, None> addStyleSource(String str, Value value);

    public native void cancelStyleLoading();

    public native StylePropertyValue getStyleAtmosphereProperty(String str);

    public native CameraOptions getStyleDefaultCamera();

    public native List<FeaturesetDescriptor> getStyleFeaturesets();

    public native String getStyleGlyphURL();

    public native Image getStyleImage(String str);

    public native Expected<String, HashMap<String, StylePropertyValue>> getStyleImportConfigProperties(String str);

    public native Expected<String, StylePropertyValue> getStyleImportConfigProperty(String str, String str2);

    public native Expected<String, Value> getStyleImportSchema(String str);

    public native List<StyleObjectInfo> getStyleImports();

    public native String getStyleJSON();

    public native Expected<String, Value> getStyleLayerProperties(String str);

    public native StylePropertyValue getStyleLayerProperty(String str, String str2);

    public native List<StyleObjectInfo> getStyleLayers();

    public native StylePropertyValue getStyleLightProperty(String str, String str2);

    public native List<StyleObjectInfo> getStyleLights();

    public native StylePropertyValue getStyleProjectionProperty(String str);

    public native StylePropertyValue getStyleRainProperty(String str);

    public native List<String> getStyleSlots();

    public native StylePropertyValue getStyleSnowProperty(String str);

    public native Expected<String, Value> getStyleSourceProperties(String str);

    public native StylePropertyValue getStyleSourceProperty(String str, String str2);

    public native List<StyleObjectInfo> getStyleSources();

    public native StylePropertyValue getStyleTerrainProperty(String str);

    public native TransitionOptions getStyleTransition();

    public native String getStyleURI();

    public native boolean hasStyleImage(String str);

    public native boolean hasStyleModel(String str);

    public native Expected<String, None> invalidateStyleCustomGeometrySourceRegion(String str, CoordinateBounds coordinateBounds);

    public native Expected<String, None> invalidateStyleCustomGeometrySourceTile(String str, CanonicalTileID canonicalTileID);

    public native Expected<String, Boolean> isStyleLayerPersistent(String str);

    public native boolean isStyleLoaded();

    public native boolean isStyleLoadingFinished();

    public native Expected<String, None> moveStyleImport(String str, ImportPosition importPosition);

    public native Expected<String, None> moveStyleLayer(String str, LayerPosition layerPosition);

    public native Expected<String, None> removeGeoJSONSourceFeatures(String str, String str2, List<String> list);

    public native Expected<String, None> removeStyleImage(String str);

    public native Expected<String, None> removeStyleImport(String str);

    public native Expected<String, None> removeStyleLayer(String str);

    public native Expected<String, None> removeStyleModel(String str);

    public native Expected<String, None> removeStyleSource(String str);

    public native Expected<String, None> removeStyleSourceUnchecked(String str);

    public native Expected<String, None> setImportColorTheme(String str, ColorTheme colorTheme);

    public native void setInitialStyleColorTheme();

    public native Expected<String, None> setStyleAtmosphere(Value value);

    public native Expected<String, None> setStyleAtmosphereProperty(String str, Value value);

    public native Expected<String, None> setStyleColorTheme(ColorTheme colorTheme);

    public native Expected<String, None> setStyleCustomGeometrySourceTileData(String str, CanonicalTileID canonicalTileID, List<Feature> list);

    public native Expected<String, None> setStyleCustomRasterSourceTileData(String str, List<CustomRasterSourceTileData> list);

    public native Expected<String, None> setStyleGeoJSONSourceData(String str, String str2, GeoJSONSourceData geoJSONSourceData);

    public native void setStyleGlyphURL(String str);

    public native Expected<String, None> setStyleImportConfigProperties(String str, HashMap<String, Value> hashMap);

    public native Expected<String, None> setStyleImportConfigProperty(String str, String str2, Value value);

    public native void setStyleJSON(String str);

    public native void setStyleJSON(String str, RuntimeStylingOptions runtimeStylingOptions);

    public native Expected<String, None> setStyleLayerProperties(String str, Value value);

    public native Cancelable setStyleLayerPropertiesAsync(String str, Value value, AsyncOperationResultCallback asyncOperationResultCallback);

    public native Expected<String, None> setStyleLayerProperty(String str, String str2, Value value);

    public native Cancelable setStyleLayerPropertyAsync(String str, String str2, Value value, AsyncOperationResultCallback asyncOperationResultCallback);

    public native Expected<String, None> setStyleLightProperty(String str, String str2, Value value);

    public native Expected<String, None> setStyleLights(Value value);

    public native Expected<String, None> setStyleProjection(Value value);

    public native Expected<String, None> setStyleProjectionProperty(String str, Value value);

    public native Expected<String, None> setStyleRain(Value value);

    public native Expected<String, None> setStyleRainProperty(String str, Value value);

    public native Expected<String, None> setStyleSnow(Value value);

    public native Expected<String, None> setStyleSnowProperty(String str, Value value);

    public native Expected<String, None> setStyleSourceProperties(String str, Value value);

    public native Expected<String, None> setStyleSourceProperty(String str, String str2, Value value);

    public native Expected<String, None> setStyleTerrain(Value value);

    public native Expected<String, None> setStyleTerrainProperty(String str, Value value);

    public native void setStyleTransition(TransitionOptions transitionOptions);

    public native void setStyleURI(String str);

    public native void setStyleURI(String str, RuntimeStylingOptions runtimeStylingOptions);

    public native boolean styleLayerExists(String str);

    public native boolean styleSourceExists(String str);

    public native Expected<String, None> updateGeoJSONSourceFeatures(String str, String str2, List<Feature> list);

    public native Expected<String, None> updateStyleImageSourceImage(String str, Image image);

    public native Expected<String, None> updateStyleImportWithJSON(String str, String str2, HashMap<String, Value> hashMap);

    public native Expected<String, None> updateStyleImportWithURI(String str, String str2, HashMap<String, Value> hashMap);
}
