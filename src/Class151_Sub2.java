/* Class151_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class151_Sub2 extends Class151 {
	private Class336 aClass336_4971;
	private boolean aBoolean4972 = false;
	static Class218 aClass218_4973 = new Class218();
	private boolean aBoolean4974 = false;
	private Class51 aClass51_4975;

	static final boolean method2451(int i, int i_0_, int i_1_) {
		try {
			if (i_0_ != 544)
				method2452(-28);
			return (i & 0x220 ^ 0xffffffff) == -545 | (i & 0x18) != 0;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, ("b.B(" + i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	final void method2442(Class42 class42, boolean bool, int i) {
		do {
			try {
				if (!aBoolean4972) {
					((Class151) this).aHa_Sub1_1215.method1863(1, class42);
					((Class151) this).aHa_Sub1_1215.method1896(260, i);
				}
				if (bool == false)
					break;
				aClass51_4975 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("b.F(" + (class42 != null ? "{...}" : "null") + ',' + bool + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	Class151_Sub2(ha_Sub1 var_ha_Sub1, Class51 class51) {
		super(var_ha_Sub1);
		do {
			try {
				aClass51_4975 = class51;
				if (((Class51) aClass51_4975).aClass42_Sub4_421 == null || !(((ha_Sub1) ((Class151) this).aHa_Sub1_1215).aBoolean4399) || !(((ha_Sub1) ((Class151) this).aHa_Sub1_1215).aBoolean4447))
					break;
				Class345 class345 = (Class246_Sub3_Sub1_Sub1.method2996(35633, ((Class151) this).aHa_Sub1_1215, false, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n"));
				Class345 class345_2_ = (Class246_Sub3_Sub1_Sub1.method2996(35632, ((Class151) this).aHa_Sub1_1215, false, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n"));
				aClass336_4971 = Class177.method2584(((Class151) this).aHa_Sub1_1215, new Class345[] { class345, class345_2_ }, true);
				aBoolean4974 = aClass336_4971 != null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("b.<init>(" + (var_ha_Sub1 != null ? "{...}" : "null") + ',' + (class51 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final void method2445(byte i) {
		try {
			if (i >= 25) {
				if (aBoolean4972) {
					((Class151) this).aHa_Sub1_1215.method1845(1, 847872872);
					((Class151) this).aHa_Sub1_1215.method1863(1, null);
					((Class151) this).aHa_Sub1_1215.method1845(0, 847872872);
					((Class151) this).aHa_Sub1_1215.method1863(1, null);
					OpenGL.glUseProgramObjectARB(0L);
					aBoolean4972 = false;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "b.E(" + i + ')');
		}
	}

	final void method2443(boolean bool, int i) {
		do {
			try {
				if (i == 255)
					break;
				aBoolean4972 = false;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "b.C(" + bool + ',' + i + ')');
			}
			break;
		} while (false);
	}

	final void method2440(boolean bool, boolean bool_3_) {
		do {
			try {
				if (bool == false) {
					Class42_Sub2 class42_sub2 = ((Class151) this).aHa_Sub1_1215.method1827(-122);
					if (!aBoolean4974 || class42_sub2 == null)
						break;
					float f = 2.0F * (1.0F - Math.abs(((ha_Sub1) (((Class151) this).aHa_Sub1_1215)).aFloatArray4438[1])) + 1.0F;
					((Class151) this).aHa_Sub1_1215.method1845(1, 847872872);
					((Class151) this).aHa_Sub1_1215.method1863(1, class42_sub2);
					((Class151) this).aHa_Sub1_1215.method1845(0, 847872872);
					((Class151) this).aHa_Sub1_1215.method1863(1, ((Class51) aClass51_4975).aClass42_Sub4_421);
					long l = ((Class336) aClass336_4971).aLong2821;
					OpenGL.glUseProgramObjectARB(l);
					OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(l, "normalSampler"), 0);
					OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(l, "envMapSampler"), 1);
					OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(l, "sunDir"), -(((ha_Sub1) ((Class151) this).aHa_Sub1_1215).aFloatArray4438[0]), -(((ha_Sub1) ((Class151) this).aHa_Sub1_1215).aFloatArray4438[1]), -(((ha_Sub1) ((Class151) this).aHa_Sub1_1215).aFloatArray4438[2]));
					OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(l, "sunColour"), f * (((ha_Sub1) ((Class151) this).aHa_Sub1_1215).aFloat4433), f * (((ha_Sub1) ((Class151) this).aHa_Sub1_1215).aFloat4420), f * (((ha_Sub1) ((Class151) this).aHa_Sub1_1215).aFloat4458), 1.0F);
					OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "sunExponent"), (64.0F + 928.0F * Math.abs(((ha_Sub1) ((Class151) this).aHa_Sub1_1215).aFloatArray4438[1])));
					aBoolean4972 = true;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("b.D(" + bool + ',' + bool_3_ + ')'));
			}
			break;
		} while (false);
	}

	final boolean method2439(int i) {
		try {
			if (i != 31565)
				return true;
			return aBoolean4974;
		} catch (RuntimeException runtimeexception) {
			throw Class64_Sub27.method667(runtimeexception, "b.A(" + i + ')');
		}
	}

	final void method2441(int i, int i_4_, int i_5_) {
		do {
			try {
				if (aBoolean4972) {
					int i_6_ = 1 << (0x3 & i);
					float f = (float) (1 << (0x7 & i >> 1374656835)) / 32.0F;
					int i_7_ = i_4_ & 0xffff;
					float f_8_ = (float) ((i_4_ & 0x37eb0) >> -558078544) / 8.0F;
					float f_9_ = (float) (0xf & i_4_ >> -311770061) / 16.0F;
					float f_10_ = (float) (0xf & i_4_ >> -1813636489) / 16.0F;
					int i_11_ = (0x7f9b2e24 & i_4_) >> 1741992827;
					long l = ((Class336) aClass336_4971).aLong2821;
					OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "time"), (float) (i_6_ * ((ha_Sub1) ((Class151) this).aHa_Sub1_1215).anInt4321 % 40000) / 40000.0F);
					OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "scale"), f);
					OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "breakWaterDepth"), (float) i_7_);
					OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "breakWaterOffset"), f_8_);
					OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(l, "waveIntensity"), f_10_, f_9_);
					OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(l, "waveExponent"), (float) i_11_);
				}
				if (i_5_ < -2)
					break;
				aClass218_4973 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, ("b.G(" + i + ',' + i_4_ + ',' + i_5_ + ')'));
			}
			break;
		} while (false);
	}

	public static void method2452(int i) {
		do {
			try {
				aClass218_4973 = null;
				if (i == 928)
					break;
				method2452(84);
			} catch (RuntimeException runtimeexception) {
				throw Class64_Sub27.method667(runtimeexception, "b.H(" + i + ')');
			}
			break;
		} while (false);
	}
}
