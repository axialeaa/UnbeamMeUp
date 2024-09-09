package com.axialeaa.unbeammeup.mixin;

import com.llamalad7.mixinextras.injector.v2.WrapWithCondition;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.EnderDragonEntityRenderer;
import net.minecraft.util.math.Matrix4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

/**
 * Bypasses the creation of all 4 vertex-creating methods responsible for the rendering of the death beams.
 */
@Mixin(EnderDragonEntityRenderer.class)
public class EnderDragonEntityRendererMixin {

    @WrapWithCondition(method = "render(Lnet/minecraft/entity/boss/dragon/EnderDragonEntity;FFLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/entity/EnderDragonEntityRenderer;method_23156(Lnet/minecraft/client/render/VertexConsumer;Lnet/minecraft/util/math/Matrix4f;FF)V"))
    private boolean shouldApply23156(VertexConsumer vertices, Matrix4f matrix, float y, float x) {
        return false;
    }

    @WrapWithCondition(method = "render(Lnet/minecraft/entity/boss/dragon/EnderDragonEntity;FFLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/entity/EnderDragonEntityRenderer;method_23157(Lnet/minecraft/client/render/VertexConsumer;Lnet/minecraft/util/math/Matrix4f;I)V"))
    private boolean shouldApply23157(VertexConsumer vertices, Matrix4f matrix, int alpha) {
        return false;
    }

    @WrapWithCondition(method = "render(Lnet/minecraft/entity/boss/dragon/EnderDragonEntity;FFLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/entity/EnderDragonEntityRenderer;method_23158(Lnet/minecraft/client/render/VertexConsumer;Lnet/minecraft/util/math/Matrix4f;FF)V"))
    private boolean shouldApply23158(VertexConsumer vertices, Matrix4f matrix, float y, float x) {
        return false;
    }

    @WrapWithCondition(method = "render(Lnet/minecraft/entity/boss/dragon/EnderDragonEntity;FFLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/entity/EnderDragonEntityRenderer;method_23159(Lnet/minecraft/client/render/VertexConsumer;Lnet/minecraft/util/math/Matrix4f;FF)V"))
    private boolean shouldApply23159(VertexConsumer vertices, Matrix4f matrix, float y, float x) {
        return false;
    }

}
