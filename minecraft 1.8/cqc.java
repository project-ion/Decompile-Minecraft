/*   1:    */ import org.lwjgl.opengl.GL11;
/*   2:    */ 
/*   3:    */ public class cqc
/*   4:    */   extends cqz
/*   5:    */ {
/*   6: 18 */   private static final oa e = new oa("textures/entity/guardian.png");
/*   7: 19 */   private static final oa j = new oa("textures/entity/guardian_elder.png");
/*   8: 20 */   private static final oa k = new oa("textures/entity/guardian_beam.png");
/*   9:    */   int a;
/*  10:    */   
/*  11:    */   public cqc(cpt paramcpt)
/*  12:    */   {
/*  13: 25 */     super(paramcpt, new cci(), 0.5F);
/*  14:    */     
/*  15: 27 */     this.a = ((cci)this.f).a();
/*  16:    */   }
/*  17:    */   
/*  18:    */   public boolean a(afg paramafg, cox paramcox, double paramDouble1, double paramDouble2, double paramDouble3)
/*  19:    */   {
/*  20: 32 */     if (super.a(paramafg, paramcox, paramDouble1, paramDouble2, paramDouble3)) {
/*  21: 33 */       return true;
/*  22:    */     }
/*  23: 36 */     if (paramafg.cn())
/*  24:    */     {
/*  25: 37 */       xm localxm = paramafg.co();
/*  26: 38 */       if (localxm != null)
/*  27:    */       {
/*  28: 40 */         brw localbrw1 = a(localxm, localxm.K * 0.5D, 1.0F);
/*  29: 41 */         brw localbrw2 = a(paramafg, paramafg.aR(), 1.0F);
/*  30: 43 */         if (paramcox.a(brt.a(localbrw2.a, localbrw2.b, localbrw2.c, localbrw1.a, localbrw1.b, localbrw1.c))) {
/*  31: 44 */           return true;
/*  32:    */         }
/*  33:    */       }
/*  34:    */     }
/*  35: 48 */     return false;
/*  36:    */   }
/*  37:    */   
/*  38:    */   private brw a(xm paramxm, double paramDouble, float paramFloat)
/*  39:    */   {
/*  40: 52 */     double d1 = paramxm.P + (paramxm.s - paramxm.P) * paramFloat;
/*  41: 53 */     double d2 = paramDouble + paramxm.Q + (paramxm.t - paramxm.Q) * paramFloat;
/*  42: 54 */     double d3 = paramxm.R + (paramxm.u - paramxm.R) * paramFloat;
/*  43: 55 */     return new brw(d1, d2, d3);
/*  44:    */   }
/*  45:    */   
/*  46:    */   public void a(afg paramafg, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*  47:    */   {
/*  48: 60 */     if (this.a != ((cci)this.f).a())
/*  49:    */     {
/*  50: 61 */       this.f = new cci();
/*  51: 62 */       this.a = ((cci)this.f).a();
/*  52:    */     }
/*  53: 65 */     super.a(paramafg, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/*  54:    */     
/*  55: 67 */     xm localxm = paramafg.co();
/*  56: 68 */     if (localxm != null)
/*  57:    */     {
/*  58: 69 */       float f1 = paramafg.p(paramFloat2);
/*  59:    */       
/*  60: 71 */       ckx localckx = ckx.a();
/*  61: 72 */       civ localciv = localckx.c();
/*  62:    */       
/*  63: 74 */       a(k);
/*  64: 75 */       GL11.glTexParameterf(3553, 10242, 10497.0F);
/*  65: 76 */       GL11.glTexParameterf(3553, 10243, 10497.0F);
/*  66: 77 */       cjm.f();
/*  67: 78 */       cjm.p();
/*  68: 79 */       cjm.k();
/*  69: 80 */       cjm.a(true);
/*  70: 81 */       float f2 = 240.0F;
/*  71: 82 */       dax.a(dax.q, f2, f2);
/*  72: 83 */       cjm.a(770, 1, 1, 0);
/*  73:    */       
/*  74: 85 */       float f3 = (float)paramafg.o.K() + paramFloat2;
/*  75: 86 */       float f4 = f3 * 0.5F % 1.0F;
/*  76: 87 */       float f5 = paramafg.aR();
/*  77:    */       
/*  78: 89 */       cjm.E();
/*  79: 90 */       cjm.b((float)paramDouble1, (float)paramDouble2 + f5, (float)paramDouble3);
/*  80:    */       
/*  81: 92 */       brw localbrw1 = a(localxm, localxm.K * 0.5D, paramFloat2);
/*  82: 93 */       brw localbrw2 = a(paramafg, f5, paramFloat2);
/*  83:    */       
/*  84: 95 */       brw localbrw3 = localbrw1.d(localbrw2);
/*  85: 96 */       double d1 = localbrw3.b() + 1.0D;
/*  86: 97 */       localbrw3 = localbrw3.a();
/*  87:    */       
/*  88:    */ 
/*  89:100 */       float f6 = (float)Math.acos(localbrw3.b);
/*  90:101 */       float f7 = (float)Math.atan2(localbrw3.c, localbrw3.a);
/*  91:102 */       cjm.b((1.570796F + -f7) * 57.295776F, 0.0F, 1.0F, 0.0F);
/*  92:103 */       cjm.b(f6 * 57.295776F, 1.0F, 0.0F, 0.0F);
/*  93:    */       
/*  94:105 */       int i = 1;
/*  95:    */       
/*  96:107 */       double d2 = f3 * 0.05D * (1.0D - (i & 0x1) * 2.5D);
/*  97:    */       
/*  98:109 */       localciv.b();
/*  99:110 */       float f8 = f1 * f1;
/* 100:111 */       localciv.b(64 + (int)(f8 * 240.0F), 32 + (int)(f8 * 192.0F), 128 - (int)(f8 * 64.0F), 255);
/* 101:    */       
/* 102:113 */       double d3 = i * 0.2D;
/* 103:114 */       double d4 = d3 * 1.41D;
/* 104:    */       
/* 105:116 */       double d5 = 0.0D + Math.cos(d2 + 2.356194490192345D) * d4;
/* 106:117 */       double d6 = 0.0D + Math.sin(d2 + 2.356194490192345D) * d4;
/* 107:118 */       double d7 = 0.0D + Math.cos(d2 + 0.7853981633974483D) * d4;
/* 108:119 */       double d8 = 0.0D + Math.sin(d2 + 0.7853981633974483D) * d4;
/* 109:120 */       double d9 = 0.0D + Math.cos(d2 + 3.926990816987241D) * d4;
/* 110:121 */       double d10 = 0.0D + Math.sin(d2 + 3.926990816987241D) * d4;
/* 111:122 */       double d11 = 0.0D + Math.cos(d2 + 5.497787143782138D) * d4;
/* 112:123 */       double d12 = 0.0D + Math.sin(d2 + 5.497787143782138D) * d4;
/* 113:    */       
/* 114:125 */       double d13 = 0.0D + Math.cos(d2 + 3.141592653589793D) * d3;
/* 115:126 */       double d14 = 0.0D + Math.sin(d2 + 3.141592653589793D) * d3;
/* 116:127 */       double d15 = 0.0D + Math.cos(d2 + 0.0D) * d3;
/* 117:128 */       double d16 = 0.0D + Math.sin(d2 + 0.0D) * d3;
/* 118:    */       
/* 119:130 */       double d17 = 0.0D + Math.cos(d2 + 1.570796326794897D) * d3;
/* 120:131 */       double d18 = 0.0D + Math.sin(d2 + 1.570796326794897D) * d3;
/* 121:132 */       double d19 = 0.0D + Math.cos(d2 + 4.71238898038469D) * d3;
/* 122:133 */       double d20 = 0.0D + Math.sin(d2 + 4.71238898038469D) * d3;
/* 123:    */       
/* 124:135 */       double d21 = d1;
/* 125:    */       
/* 126:137 */       double d22 = 0.0D;
/* 127:138 */       double d23 = 0.4999D;
/* 128:139 */       double d24 = -1.0F + f4;
/* 129:140 */       double d25 = d1 * (0.5D / d3) + d24;
/* 130:    */       
/* 131:142 */       localciv.a(d13, d21, d14, d23, d25);
/* 132:143 */       localciv.a(d13, 0.0D, d14, d23, d24);
/* 133:144 */       localciv.a(d15, 0.0D, d16, d22, d24);
/* 134:145 */       localciv.a(d15, d21, d16, d22, d25);
/* 135:    */       
/* 136:147 */       localciv.a(d17, d21, d18, d23, d25);
/* 137:148 */       localciv.a(d17, 0.0D, d18, d23, d24);
/* 138:149 */       localciv.a(d19, 0.0D, d20, d22, d24);
/* 139:150 */       localciv.a(d19, d21, d20, d22, d25);
/* 140:    */       
/* 141:    */ 
/* 142:    */ 
/* 143:    */ 
/* 144:    */ 
/* 145:    */ 
/* 146:    */ 
/* 147:    */ 
/* 148:    */ 
/* 149:    */ 
/* 150:    */ 
/* 151:    */ 
/* 152:    */ 
/* 153:    */ 
/* 154:    */ 
/* 155:    */ 
/* 156:    */ 
/* 157:    */ 
/* 158:    */ 
/* 159:    */ 
/* 160:    */ 
/* 161:    */ 
/* 162:    */ 
/* 163:    */ 
/* 164:    */ 
/* 165:    */ 
/* 166:177 */       double d26 = 0.0D;
/* 167:178 */       if (paramafg.W % 2 == 0) {
/* 168:179 */         d26 = 0.5D;
/* 169:    */       }
/* 170:181 */       localciv.a(d5, d21, d6, 0.5D, d26 + 0.5D);
/* 171:182 */       localciv.a(d7, d21, d8, 1.0D, d26 + 0.5D);
/* 172:183 */       localciv.a(d11, d21, d12, 1.0D, d26);
/* 173:184 */       localciv.a(d9, d21, d10, 0.5D, d26);
/* 174:    */       
/* 175:186 */       localckx.b();
/* 176:    */       
/* 177:188 */       cjm.F();
/* 178:    */     }
/* 179:    */   }
/* 180:    */   
/* 181:    */   protected void a(afg paramafg, float paramFloat)
/* 182:    */   {
/* 183:194 */     if (paramafg.cl()) {
/* 184:195 */       cjm.a(2.35F, 2.35F, 2.35F);
/* 185:    */     }
/* 186:    */   }
/* 187:    */   
/* 188:    */   protected oa a(afg paramafg)
/* 189:    */   {
/* 190:201 */     return paramafg.cl() ? j : e;
/* 191:    */   }
/* 192:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cqc
 * JD-Core Version:    0.7.0.1
 */