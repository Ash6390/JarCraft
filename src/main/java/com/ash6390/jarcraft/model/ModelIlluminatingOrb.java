package com.ash6390.jarcraft.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelIlluminatingOrb extends ModelBase
{
    //fields
    ModelRenderer externalCube;
    ModelRenderer internalCube;

    public ModelIlluminatingOrb()
    {
        textureWidth = 128;
        textureHeight = 32;

        externalCube = new ModelRenderer(this, 0, 0);
        externalCube.addBox(0F, 0F, 0F, 16, 16, 16);
        externalCube.setRotationPoint(-8F, 8F, -8F);
        externalCube.setTextureSize(128, 32);
        externalCube.mirror = true;
        setRotation(externalCube, 0F, 0F, 0F);
        internalCube = new ModelRenderer(this, 67, 0);
        internalCube.addBox(0F, 0F, 0F, 8, 8, 8);
        internalCube.setRotationPoint(-4F, 12F, -4F);
        internalCube.setTextureSize(128, 32);
        internalCube.mirror = true;
        setRotation(internalCube, 0F, 20F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        externalCube.render(f5);
        internalCube.render(f5);
    }

    public void renderModel(float f)
    {
        externalCube.render(f);
        internalCube.render(f);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
    {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }

}
