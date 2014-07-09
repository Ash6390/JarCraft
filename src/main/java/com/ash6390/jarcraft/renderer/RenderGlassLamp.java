package com.ash6390.jarcraft.renderer;

import com.ash6390.jarcraft.model.ModelGlassLamp;
import com.ash6390.jarcraft.reference.References;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderGlassLamp extends TileEntitySpecialRenderer
{

    private static final ResourceLocation texture = new ResourceLocation(References.MODID + ":textures/model/glassLamp.png");

    private ModelGlassLamp model;

    public RenderGlassLamp()
    {
        this.model = new ModelGlassLamp();
    }

    @Override
    public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float f)
    {
        GL11.glPushMatrix();
            GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
            GL11.glRotatef(180, 0F, 0F, 1F);
            this.bindTexture(texture);
            GL11.glPushMatrix();
                this.model.renderModel(0.0625F);
            GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}
