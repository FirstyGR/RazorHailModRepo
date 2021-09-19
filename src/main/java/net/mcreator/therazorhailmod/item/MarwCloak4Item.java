
package net.mcreator.therazorhailmod.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.BipedModel;

import net.mcreator.therazorhailmod.TherazorhailModModElements;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@TherazorhailModModElements.ModElement.Tag
public class MarwCloak4Item extends TherazorhailModModElements.ModElement {
	@ObjectHolder("therazorhail_mod:marw_cloak_4_helmet")
	public static final Item helmet = null;
	@ObjectHolder("therazorhail_mod:marw_cloak_4_chestplate")
	public static final Item body = null;
	@ObjectHolder("therazorhail_mod:marw_cloak_4_leggings")
	public static final Item legs = null;
	@ObjectHolder("therazorhail_mod:marw_cloak_4_boots")
	public static final Item boots = null;
	public MarwCloak4Item(TherazorhailModModElements instance) {
		super(instance, 34);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{2, 5, 6, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 9;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return "marw_cloak_4";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
				BipedModel armorModel = new BipedModel(1);
				armorModel.bipedHead = new ModelMarwCloakV2().Head;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "therazorhail_mod:textures/marwcloakv2.png";
			}
		}.setRegistryName("marw_cloak_4_helmet"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
				BipedModel armorModel = new BipedModel(1);
				armorModel.bipedBody = new ModelMarwCloakV2().cape;
				armorModel.bipedLeftArm = new ModelMarwCloakV2().LeftArm;
				armorModel.bipedRightArm = new ModelMarwCloakV2().RightArm;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "therazorhail_mod:textures/marwcloakv2.png";
			}
		}.setRegistryName("marw_cloak_4_chestplate"));
	}
	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelMarwCloakV2 extends EntityModel<Entity> {
		private final ModelRenderer Head;
		private final ModelRenderer cube_r24;
		private final ModelRenderer cube_r25;
		private final ModelRenderer cube_r26;
		private final ModelRenderer cube_r27;
		private final ModelRenderer cube_r28;
		private final ModelRenderer cube_r29;
		private final ModelRenderer cube_r29_r1;
		private final ModelRenderer cube_r30;
		private final ModelRenderer cube_r31;
		private final ModelRenderer cube_r32;
		private final ModelRenderer cube_r33;
		private final ModelRenderer cube_r34;
		private final ModelRenderer cube_r35;
		private final ModelRenderer RightArm;
		private final ModelRenderer LeftArm;
		private final ModelRenderer RightLeg;
		private final ModelRenderer LeftLeg;
		private final ModelRenderer cape;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r6;
		private final ModelRenderer cube_r7;
		private final ModelRenderer cube_r8;
		private final ModelRenderer cube_r9;
		private final ModelRenderer cube_r10;
		private final ModelRenderer cube_r11;
		private final ModelRenderer cube_r12;
		private final ModelRenderer cube_r13;
		private final ModelRenderer cube_r14;
		private final ModelRenderer cube_r15;
		private final ModelRenderer cube_r16;
		private final ModelRenderer cube_r17;
		private final ModelRenderer cube_r18;
		private final ModelRenderer cube_r19;
		private final ModelRenderer cube_r20;
		private final ModelRenderer cube_r21;
		private final ModelRenderer cube_r22;
		private final ModelRenderer cube_r23;
		public ModelMarwCloakV2() {
			textureWidth = 64;
			textureHeight = 64;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, -1.0F, 0.0F);
			Head.setTextureOffset(0, 0).addBox(-2.75F, -9.5F, -2.5F, 6.0F, 1.0F, 9.0F, 0.0F, false);
			Head.setTextureOffset(0, 0).addBox(3.0F, -9.0F, 3.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			Head.setTextureOffset(0, 0).addBox(-5.0F, -9.0F, 3.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			cube_r24 = new ModelRenderer(this);
			cube_r24.setRotationPoint(-4.525F, -3.0568F, 6.9879F);
			Head.addChild(cube_r24);
			setRotationAngle(cube_r24, 0.1609F, -0.4756F, 0.0454F);
			cube_r24.setTextureOffset(0, 0).addBox(-1.0F, -6.0F, -0.5F, 4.0F, 11.0F, 1.0F, 0.0F, false);
			cube_r25 = new ModelRenderer(this);
			cube_r25.setRotationPoint(-7.3505F, -3.5605F, 4.0276F);
			Head.addChild(cube_r25);
			setRotationAngle(cube_r25, -0.0138F, -1.1331F, 0.1828F);
			cube_r25.setTextureOffset(0, 0).addBox(-0.5F, -5.75F, -1.5F, 4.0F, 11.0F, 1.0F, 0.0F, false);
			cube_r26 = new ModelRenderer(this);
			cube_r26.setRotationPoint(5.8956F, -0.7658F, 5.435F);
			Head.addChild(cube_r26);
			setRotationAngle(cube_r26, 0.2354F, 1.0224F, -0.0485F);
			cube_r26.setTextureOffset(0, 0).addBox(-1.0F, -7.5F, 0.5F, 4.0F, 10.0F, 1.0F, 0.0F, false);
			cube_r27 = new ModelRenderer(this);
			cube_r27.setRotationPoint(3.7628F, -9.7625F, 0.5198F);
			Head.addChild(cube_r27);
			setRotationAngle(cube_r27, -2.1729F, 1.5281F, 3.1082F);
			cube_r27.setTextureOffset(0, 0).addBox(-3.0F, -0.5F, -1.5F, 6.0F, 3.0F, 1.0F, 0.0F, false);
			cube_r28 = new ModelRenderer(this);
			cube_r28.setRotationPoint(7.3367F, -6.052F, 0.3724F);
			Head.addChild(cube_r28);
			setRotationAngle(cube_r28, -2.6529F, 1.5281F, 3.1082F);
			cube_r28.setTextureOffset(0, 0).addBox(-3.0F, -2.5F, -1.75F, 6.0F, 5.0F, 1.0F, 0.0F, false);
			cube_r29 = new ModelRenderer(this);
			cube_r29.setRotationPoint(7.5516F, -1.5294F, 0.3697F);
			Head.addChild(cube_r29);
			setRotationAngle(cube_r29, -3.0169F, 1.5281F, 3.1082F);
			cube_r29_r1 = new ModelRenderer(this);
			cube_r29_r1.setRotationPoint(0.0F, 0.5F, 0.5F);
			cube_r29.addChild(cube_r29_r1);
			setRotationAngle(cube_r29_r1, 0.1309F, 0.0F, 0.0F);
			cube_r29_r1.setTextureOffset(0, 0).addBox(-3.0F, -2.5F, -0.75F, 6.0F, 5.0F, 1.0F, 0.0F, false);
			cube_r30 = new ModelRenderer(this);
			cube_r30.setRotationPoint(-3.9044F, -8.9942F, 0.1634F);
			Head.addChild(cube_r30);
			setRotationAngle(cube_r30, -2.1642F, -1.5281F, -3.1082F);
			cube_r30.setTextureOffset(0, 0).addBox(-3.0F, -1.5F, -1.25F, 6.0F, 3.0F, 1.0F, 0.0F, false);
			cube_r31 = new ModelRenderer(this);
			cube_r31.setRotationPoint(-6.7559F, -6.0185F, 0.0459F);
			Head.addChild(cube_r31);
			setRotationAngle(cube_r31, -2.6555F, -1.5281F, -3.1082F);
			cube_r31.setTextureOffset(0, 0).addBox(-3.0F, -2.5F, -1.5F, 6.0F, 5.0F, 1.0F, 0.0F, false);
			cube_r32 = new ModelRenderer(this);
			cube_r32.setRotationPoint(-7.6037F, -1.091F, 0.0167F);
			Head.addChild(cube_r32);
			setRotationAngle(cube_r32, -3.0045F, -1.5281F, -3.1082F);
			cube_r32.setTextureOffset(0, 0).addBox(-3.0F, -2.5F, -0.5F, 6.0F, 5.0F, 1.0F, 0.0F, false);
			cube_r33 = new ModelRenderer(this);
			cube_r33.setRotationPoint(2.1024F, -0.8457F, 8.8296F);
			Head.addChild(cube_r33);
			setRotationAngle(cube_r33, 0.2233F, 0.1277F, -0.0092F);
			cube_r33.setTextureOffset(0, 0).addBox(-1.5F, -9.0F, -0.5F, 3.0F, 12.0F, 1.0F, 0.0F, false);
			cube_r34 = new ModelRenderer(this);
			cube_r34.setRotationPoint(4.9142F, -1.1655F, 7.7315F);
			Head.addChild(cube_r34);
			setRotationAngle(cube_r34, 0.3299F, 0.6052F, 0.127F);
			cube_r34.setTextureOffset(0, 0).addBox(-1.5F, -7.5F, -0.5F, 3.0F, 11.0F, 1.0F, 0.0F, false);
			cube_r35 = new ModelRenderer(this);
			cube_r35.setRotationPoint(0.5F, -3.5F, 9.5F);
			Head.addChild(cube_r35);
			setRotationAngle(cube_r35, 0.2214F, 0.0F, -0.0381F);
			cube_r35.setTextureOffset(0, 0).addBox(-3.0F, -6.5F, -1.75F, 3.0F, 12.0F, 1.0F, 0.0F, false);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			RightArm.setTextureOffset(0, 0).addBox(-2.0F, 9.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
			LeftArm.setTextureOffset(0, 0).addBox(0.0F, 9.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
			RightLeg.setTextureOffset(0, 0).addBox(-1.0F, 11.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
			LeftLeg.setTextureOffset(0, 0).addBox(-1.0F, 11.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cape = new ModelRenderer(this);
			cape.setRotationPoint(0.0F, 0.0F, 0.0F);
			cape.setTextureOffset(0, 0).addBox(-11.5F, 12.0F, -3.0F, 1.0F, 12.0F, 6.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(-1.5062F, 8.106F, 9.7493F);
			cape.addChild(cube_r1);
			setRotationAngle(cube_r1, -1.1082F, 0.9521F, -1.1849F);
			cube_r1.setTextureOffset(0, 0).addBox(3.8533F, -6.2737F, -2.9993F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			cube_r1.setTextureOffset(0, 0).addBox(3.8533F, -6.2737F, -2.9993F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(-5.5062F, 8.106F, 7.9993F);
			cape.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0F, 1.0036F, 0.0F);
			cube_r2.setTextureOffset(0, 0).addBox(-2.4938F, 3.894F, -2.9993F, 1.0F, 12.0F, 6.0F, 0.0F, false);
			cube_r2.setTextureOffset(0, 0).addBox(-2.4938F, 3.894F, -2.9993F, 1.0F, 12.0F, 6.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(-5.5062F, 8.106F, 7.9993F);
			cape.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.3241F, 0.9627F, 0.3823F);
			cube_r3.setTextureOffset(0, 0).addBox(-1.4543F, -7.1655F, -2.9908F, 1.0F, 12.0F, 6.0F, 0.0F, false);
			cube_r3.setTextureOffset(0, 0).addBox(-1.4543F, -7.1655F, -2.9908F, 1.0F, 12.0F, 6.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(-5.5062F, 8.106F, 7.9993F);
			cape.addChild(cube_r4);
			setRotationAngle(cube_r4, -0.7006F, 0.7914F, -0.8702F);
			cube_r4.setTextureOffset(0, 0).addBox(3.8533F, -6.2737F, -2.9993F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			cube_r4.setTextureOffset(0, 0).addBox(3.8533F, -6.2737F, -2.9993F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(-8.0062F, 8.106F, 4.9993F);
			cape.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.0F, 0.3491F, 0.0F);
			cube_r5.setTextureOffset(0, 0).addBox(-2.4938F, 3.894F, -2.9993F, 1.0F, 12.0F, 6.0F, 0.0F, false);
			cube_r5.setTextureOffset(0, 0).addBox(-2.4938F, 3.894F, -2.9993F, 1.0F, 12.0F, 6.0F, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(-8.0062F, 8.106F, 4.9993F);
			cape.addChild(cube_r6);
			setRotationAngle(cube_r6, 0.0813F, 0.3347F, 0.2276F);
			cube_r6.setTextureOffset(0, 0).addBox(-1.4543F, -7.1655F, -2.9908F, 1.0F, 12.0F, 6.0F, 0.0F, false);
			cube_r6.setTextureOffset(0, 0).addBox(-1.4543F, -7.1655F, -2.9908F, 1.0F, 12.0F, 6.0F, 0.0F, false);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(-8.0062F, 8.106F, 4.9993F);
			cape.addChild(cube_r7);
			setRotationAngle(cube_r7, -0.1931F, 0.2926F, -0.5958F);
			cube_r7.setTextureOffset(0, 0).addBox(3.8533F, -6.2737F, -2.9993F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			cube_r7.setTextureOffset(0, 0).addBox(3.8533F, -6.2737F, -2.9993F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(-9.0062F, 8.106F, -0.0007F);
			cape.addChild(cube_r8);
			setRotationAngle(cube_r8, 0.0041F, -0.006F, 0.2148F);
			cube_r8.setTextureOffset(0, 0).addBox(-1.4543F, -7.1655F, -2.9908F, 1.0F, 12.0F, 6.0F, 0.0F, false);
			cube_r8.setTextureOffset(0, 0).addBox(-1.4543F, -7.1655F, -2.9908F, 1.0F, 12.0F, 6.0F, 0.0F, false);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(-9.0062F, 8.106F, -0.0007F);
			cape.addChild(cube_r9);
			setRotationAngle(cube_r9, 0.0F, 0.0F, -0.5672F);
			cube_r9.setTextureOffset(0, 0).addBox(3.8533F, -6.2737F, -2.9993F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			cube_r9.setTextureOffset(0, 0).addBox(3.8533F, -6.2737F, -2.9993F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			cube_r10 = new ModelRenderer(this);
			cube_r10.setRotationPoint(7.9938F, 8.106F, 4.9993F);
			cape.addChild(cube_r10);
			setRotationAngle(cube_r10, -2.9226F, 0.3286F, -2.5379F);
			cube_r10.setTextureOffset(0, 0).addBox(3.8533F, -6.2737F, -2.9993F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			cube_r10.setTextureOffset(0, 0).addBox(3.8533F, -6.2737F, -2.9993F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			cube_r11 = new ModelRenderer(this);
			cube_r11.setRotationPoint(8.9938F, 8.106F, -0.0007F);
			cape.addChild(cube_r11);
			setRotationAngle(cube_r11, -3.1416F, 0.0F, 3.1416F);
			cube_r11.setTextureOffset(0, 0).addBox(-2.4938F, 3.894F, -2.9993F, 1.0F, 12.0F, 6.0F, 0.0F, false);
			cube_r11.setTextureOffset(0, 0).addBox(-2.4938F, 3.894F, -2.9993F, 1.0F, 12.0F, 6.0F, 0.0F, false);
			cube_r12 = new ModelRenderer(this);
			cube_r12.setRotationPoint(8.9938F, 8.106F, -0.0007F);
			cape.addChild(cube_r12);
			setRotationAngle(cube_r12, -3.1375F, 0.006F, 2.9268F);
			cube_r12.setTextureOffset(0, 0).addBox(-1.4543F, -7.1655F, -2.9908F, 1.0F, 12.0F, 6.0F, 0.0F, false);
			cube_r12.setTextureOffset(0, 0).addBox(-1.4543F, -7.1655F, -2.9908F, 1.0F, 12.0F, 6.0F, 0.0F, false);
			cube_r13 = new ModelRenderer(this);
			cube_r13.setRotationPoint(8.9938F, 8.106F, -0.0007F);
			cape.addChild(cube_r13);
			setRotationAngle(cube_r13, 3.1416F, 0.0F, -2.5744F);
			cube_r13.setTextureOffset(0, 0).addBox(3.8533F, -6.2737F, -2.9993F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			cube_r13.setTextureOffset(0, 0).addBox(3.8533F, -6.2737F, -2.9993F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			cube_r14 = new ModelRenderer(this);
			cube_r14.setRotationPoint(-1.5062F, 8.106F, 9.7493F);
			cape.addChild(cube_r14);
			setRotationAngle(cube_r14, 0.0F, 1.309F, 0.0F);
			cube_r14.setTextureOffset(0, 0).addBox(-2.4938F, 3.894F, -2.9993F, 1.0F, 12.0F, 6.0F, 0.0F, false);
			cube_r14.setTextureOffset(0, 0).addBox(-2.4938F, 3.894F, -2.9993F, 1.0F, 12.0F, 6.0F, 0.0F, false);
			cube_r15 = new ModelRenderer(this);
			cube_r15.setRotationPoint(-1.5062F, 8.106F, 9.7493F);
			cape.addChild(cube_r15);
			setRotationAngle(cube_r15, 0.6654F, 1.229F, 0.6891F);
			cube_r15.setTextureOffset(0, 0).addBox(-1.4543F, -7.1655F, -2.9908F, 1.0F, 12.0F, 6.0F, 0.0F, false);
			cube_r15.setTextureOffset(0, 0).addBox(-1.4543F, -7.1655F, -2.9908F, 1.0F, 12.0F, 6.0F, 0.0F, false);
			cube_r16 = new ModelRenderer(this);
			cube_r16.setRotationPoint(5.4938F, 8.106F, 8.9993F);
			cape.addChild(cube_r16);
			setRotationAngle(cube_r16, -2.6113F, 0.6711F, -2.3855F);
			cube_r16.setTextureOffset(0, 0).addBox(3.8533F, -6.2737F, -2.9993F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			cube_r16.setTextureOffset(0, 0).addBox(3.8533F, -6.2737F, -2.9993F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			cube_r17 = new ModelRenderer(this);
			cube_r17.setRotationPoint(7.9938F, 8.106F, 4.9993F);
			cape.addChild(cube_r17);
			setRotationAngle(cube_r17, -3.1416F, 0.3927F, 3.1416F);
			cube_r17.setTextureOffset(0, 0).addBox(-2.4938F, 3.894F, -2.9993F, 1.0F, 12.0F, 6.0F, 0.0F, false);
			cube_r17.setTextureOffset(0, 0).addBox(-2.4938F, 3.894F, -2.9993F, 1.0F, 12.0F, 6.0F, 0.0F, false);
			cube_r18 = new ModelRenderer(this);
			cube_r18.setRotationPoint(7.9938F, 8.106F, 4.9993F);
			cape.addChild(cube_r18);
			setRotationAngle(cube_r18, 3.0574F, 0.3892F, 2.9092F);
			cube_r18.setTextureOffset(0, 0).addBox(-1.4543F, -7.1655F, -2.9908F, 1.0F, 12.0F, 6.0F, 0.0F, false);
			cube_r18.setTextureOffset(0, 0).addBox(-1.4543F, -7.1655F, -2.9908F, 1.0F, 12.0F, 6.0F, 0.0F, false);
			cube_r19 = new ModelRenderer(this);
			cube_r19.setRotationPoint(5.4938F, 8.106F, 8.9993F);
			cape.addChild(cube_r19);
			setRotationAngle(cube_r19, -3.1416F, 0.829F, 3.1416F);
			cube_r19.setTextureOffset(0, 0).addBox(-2.4938F, 3.894F, -2.9993F, 1.0F, 12.0F, 6.0F, 0.0F, false);
			cube_r19.setTextureOffset(0, 0).addBox(-2.4938F, 3.894F, -2.9993F, 1.0F, 12.0F, 6.0F, 0.0F, false);
			cube_r20 = new ModelRenderer(this);
			cube_r20.setRotationPoint(5.4938F, 8.106F, 8.9993F);
			cape.addChild(cube_r20);
			setRotationAngle(cube_r20, 2.9157F, 0.8102F, 2.8273F);
			cube_r20.setTextureOffset(0, 0).addBox(-1.4543F, -7.1655F, -2.9908F, 1.0F, 12.0F, 6.0F, 0.0F, false);
			cube_r20.setTextureOffset(0, 0).addBox(-1.4543F, -7.1655F, -2.9908F, 1.0F, 12.0F, 6.0F, 0.0F, false);
			cube_r21 = new ModelRenderer(this);
			cube_r21.setRotationPoint(2.4938F, 8.106F, 9.9993F);
			cape.addChild(cube_r21);
			setRotationAngle(cube_r21, 1.9404F, 1.3414F, 1.9263F);
			cube_r21.setTextureOffset(0, 0).addBox(-1.4543F, -7.1655F, -2.9908F, 1.0F, 12.0F, 6.0F, 0.0F, false);
			cube_r21.setTextureOffset(0, 0).addBox(-1.4543F, -7.1655F, -2.9908F, 1.0F, 12.0F, 6.0F, 0.0F, false);
			cube_r22 = new ModelRenderer(this);
			cube_r22.setRotationPoint(2.4938F, 8.106F, 9.9993F);
			cape.addChild(cube_r22);
			setRotationAngle(cube_r22, -3.1416F, 1.4835F, 3.1416F);
			cube_r22.setTextureOffset(50, 46).addBox(-2.4938F, 3.894F, -2.9993F, 1.0F, 12.0F, 6.0F, 0.0F, false);
			cube_r22.setTextureOffset(0, 0).addBox(-2.4938F, 3.894F, -2.9993F, 1.0F, 12.0F, 6.0F, 0.0F, false);
			cube_r23 = new ModelRenderer(this);
			cube_r23.setRotationPoint(2.4938F, 8.106F, 9.9993F);
			cape.addChild(cube_r23);
			setRotationAngle(cube_r23, -1.7322F, 0.9976F, -1.7068F);
			cube_r23.setTextureOffset(0, 0).addBox(3.8533F, -6.2737F, -2.9993F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			cube_r23.setTextureOffset(0, 0).addBox(3.8533F, -6.2737F, -2.9993F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Head.render(matrixStack, buffer, packedLight, packedOverlay);
			RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
			LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
			RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
			LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
			cape.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.RightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.LeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}
}
