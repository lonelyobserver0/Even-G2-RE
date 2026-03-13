package com.mapbox.maps.renderer.gl;

import android.opengl.GLES20;
import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0002J\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0006J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/mapbox/maps/renderer/gl/TextureRenderer;", "", "depth", "", "(F)V", "attributePosition", "", "attributeTextureCoord", "program", "uniformTexture", "vbo", "", "prepare", "", "release", "render", "textureID", "setupVbo", "vertexArray", "", "textureArray", "Companion", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class TextureRenderer {

    @Deprecated
    public static final int BYTES_PER_FLOAT = 4;

    @Deprecated
    public static final int COORDS_PER_TEX = 2;

    @Deprecated
    public static final int COORDS_PER_VERTEX = 3;

    @Deprecated
    public static final int TEX_STRIDE = 8;

    @Deprecated
    public static final int VERTEX_COUNT = 4;

    @Deprecated
    public static final int VERTEX_STRIDE = 12;
    private int attributePosition;
    private int attributeTextureCoord;
    private final float depth;
    private int program;
    private int uniformTexture;
    private int[] vbo;
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final String VERTEX_SHADER_CODE = StubApp.getString2(14575);

    @Deprecated
    private static final String FRAGMENT_SHADER_CODE = StubApp.getString2(14576);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/mapbox/maps/renderer/gl/TextureRenderer$Companion;", "", "()V", "BYTES_PER_FLOAT", "", "COORDS_PER_TEX", "COORDS_PER_VERTEX", "FRAGMENT_SHADER_CODE", "", "getFRAGMENT_SHADER_CODE", "()Ljava/lang/String;", "TEX_STRIDE", "VERTEX_COUNT", "VERTEX_SHADER_CODE", "getVERTEX_SHADER_CODE", "VERTEX_STRIDE", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getFRAGMENT_SHADER_CODE() {
            return TextureRenderer.FRAGMENT_SHADER_CODE;
        }

        public final String getVERTEX_SHADER_CODE() {
            return TextureRenderer.VERTEX_SHADER_CODE;
        }

        private Companion() {
        }
    }

    public TextureRenderer() {
        this(0.0f, 1, null);
    }

    private final void prepare() {
        float f10 = this.depth;
        setupVbo(new float[]{-1.0f, -1.0f, f10, 1.0f, -1.0f, f10, -1.0f, 1.0f, f10, 1.0f, 1.0f, f10}, new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        GlUtils glUtils = GlUtils.INSTANCE;
        int loadShader = glUtils.loadShader(35633, VERTEX_SHADER_CODE);
        glUtils.checkCompileStatus(loadShader);
        int loadShader2 = glUtils.loadShader(35632, FRAGMENT_SHADER_CODE);
        glUtils.checkCompileStatus(loadShader2);
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, loadShader);
        GLES20.glAttachShader(glCreateProgram, loadShader2);
        GLES20.glLinkProgram(glCreateProgram);
        this.program = glCreateProgram;
        this.attributePosition = GLES20.glGetAttribLocation(glCreateProgram, StubApp.getString2(14577));
        this.attributeTextureCoord = GLES20.glGetAttribLocation(this.program, StubApp.getString2(14578));
        this.uniformTexture = GLES20.glGetUniformLocation(this.program, StubApp.getString2(14579));
    }

    private final void setupVbo(float[] vertexArray, float[] textureArray) {
        GLES20.glGenBuffers(2, this.vbo, 0);
        GLES20.glBindBuffer(34962, this.vbo[0]);
        int length = vertexArray.length * 4;
        GlUtils glUtils = GlUtils.INSTANCE;
        GLES20.glBufferData(34962, length, glUtils.toFloatBuffer(vertexArray), 35044);
        GLES20.glBindBuffer(34962, this.vbo[1]);
        GLES20.glBufferData(34962, textureArray.length * 4, glUtils.toFloatBuffer(textureArray), 35044);
        GLES20.glBindBuffer(34962, 0);
    }

    public final void release() {
        if (this.program != 0) {
            int[] iArr = this.vbo;
            GLES20.glDeleteBuffers(iArr.length, iArr, 0);
            GLES20.glDeleteProgram(this.program);
            this.program = 0;
        }
    }

    public final void render(int textureID) {
        if (this.program == 0) {
            prepare();
        }
        GLES20.glUseProgram(this.program);
        GLES20.glBindBuffer(34962, this.vbo[0]);
        GLES20.glVertexAttribPointer(this.attributePosition, 3, 5126, false, 12, 0);
        GLES20.glEnableVertexAttribArray(this.attributePosition);
        GLES20.glBindBuffer(34962, this.vbo[1]);
        GLES20.glVertexAttribPointer(this.attributeTextureCoord, 2, 5126, false, 8, 0);
        GLES20.glEnableVertexAttribArray(this.attributeTextureCoord);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, textureID);
        GLES20.glUniform1i(this.uniformTexture, 0);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.attributePosition);
        GLES20.glDisableVertexAttribArray(this.attributeTextureCoord);
        GLES20.glBindBuffer(34962, 0);
        GLES20.glUseProgram(0);
    }

    public TextureRenderer(float f10) {
        this.depth = f10;
        this.vbo = new int[2];
    }

    public /* synthetic */ TextureRenderer(float f10, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0.0f : f10);
    }
}
