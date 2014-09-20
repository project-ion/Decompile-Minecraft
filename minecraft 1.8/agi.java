/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ import java.util.UUID;
/*   4:    */ 
/*   5:    */ public class agi
/*   6:    */   extends afm
/*   7:    */   implements afr
/*   8:    */ {
/*   9: 29 */   private static final UUID b = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
/*  10: 30 */   private static final ya c = new ya(b, "Drinking speed penalty", -0.25D, 0).a(false);
/*  11: 33 */   private static final alq[] bk = { amk.aT, amk.aY, amk.aC, amk.bB, amk.bA, amk.H, amk.y, amk.y };
/*  12:    */   private int bl;
/*  13:    */   
/*  14:    */   public agi(aqu paramaqu)
/*  15:    */   {
/*  16: 40 */     super(paramaqu);
/*  17: 41 */     a(0.6F, 1.95F);
/*  18:    */     
/*  19: 43 */     this.i.a(1, new yy(this));
/*  20: 44 */     this.i.a(2, new zz(this, 1.0D, 60, 10.0F));
/*  21: 45 */     this.i.a(2, new zy(this, 1.0D));
/*  22: 46 */     this.i.a(2, this.a);
/*  23: 47 */     this.i.a(3, new zh(this, ahd.class, 8.0F));
/*  24: 48 */     this.i.a(3, new zx(this));
/*  25:    */     
/*  26: 50 */     this.bg.a(1, new aal(this, false, new Class[0]));
/*  27: 51 */     this.bg.a(2, new aaq(this, ahd.class, true));
/*  28:    */   }
/*  29:    */   
/*  30:    */   protected void h()
/*  31:    */   {
/*  32: 56 */     super.h();
/*  33:    */     
/*  34: 58 */     H().a(21, Byte.valueOf((byte)0));
/*  35:    */   }
/*  36:    */   
/*  37:    */   protected String z()
/*  38:    */   {
/*  39: 63 */     return null;
/*  40:    */   }
/*  41:    */   
/*  42:    */   protected String bn()
/*  43:    */   {
/*  44: 68 */     return null;
/*  45:    */   }
/*  46:    */   
/*  47:    */   protected String bo()
/*  48:    */   {
/*  49: 73 */     return null;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public void a(boolean paramBoolean)
/*  53:    */   {
/*  54: 77 */     H().b(21, Byte.valueOf((byte)(paramBoolean ? 1 : 0)));
/*  55:    */   }
/*  56:    */   
/*  57:    */   public boolean n()
/*  58:    */   {
/*  59: 81 */     return H().a(21) == 1;
/*  60:    */   }
/*  61:    */   
/*  62:    */   protected void aW()
/*  63:    */   {
/*  64: 86 */     super.aW();
/*  65:    */     
/*  66: 88 */     a(afs.a).a(26.0D);
/*  67: 89 */     a(afs.d).a(0.25D);
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void m()
/*  71:    */   {
/*  72: 94 */     if (!this.o.D)
/*  73:    */     {
/*  74:    */       Object localObject;
/*  75: 95 */       if (n())
/*  76:    */       {
/*  77: 96 */         if (this.bl-- <= 0)
/*  78:    */         {
/*  79: 97 */           a(false);
/*  80: 98 */           amj localamj = bz();
/*  81: 99 */           c(0, null);
/*  82:101 */           if ((localamj != null) && (localamj.b() == amk.bz))
/*  83:    */           {
/*  84:102 */             localObject = amk.bz.h(localamj);
/*  85:103 */             if (localObject != null) {
/*  86:104 */               for (wq localwq : (List)localObject) {
/*  87:105 */                 c(new wq(localwq));
/*  88:    */               }
/*  89:    */             }
/*  90:    */           }
/*  91:110 */           a(afs.d).c(c);
/*  92:    */         }
/*  93:    */       }
/*  94:    */       else
/*  95:    */       {
/*  96:113 */         int i = -1;
/*  97:115 */         if ((this.V.nextFloat() < 0.15F) && (a(bof.h)) && (!a(wp.o))) {
/*  98:116 */           i = 8237;
/*  99:117 */         } else if ((this.V.nextFloat() < 0.15F) && (au()) && (!a(wp.n))) {
/* 100:118 */           i = 16307;
/* 101:119 */         } else if ((this.V.nextFloat() < 0.05F) && (bm() < bt())) {
/* 102:120 */           i = 16341;
/* 103:121 */         } else if ((this.V.nextFloat() < 0.25F) && (u() != null) && (!a(wp.c)) && (u().h(this) > 121.0D)) {
/* 104:122 */           i = 16274;
/* 105:123 */         } else if ((this.V.nextFloat() < 0.25F) && (u() != null) && (!a(wp.c)) && (u().h(this) > 121.0D)) {
/* 106:124 */           i = 16274;
/* 107:    */         }
/* 108:127 */         if (i > -1)
/* 109:    */         {
/* 110:128 */           c(0, new amj(amk.bz, 1, i));
/* 111:129 */           this.bl = bz().l();
/* 112:130 */           a(true);
/* 113:131 */           localObject = a(afs.d);
/* 114:132 */           ((xz)localObject).c(c);
/* 115:133 */           ((xz)localObject).b(c);
/* 116:    */         }
/* 117:    */       }
/* 118:137 */       if (this.V.nextFloat() < 0.00075F) {
/* 119:138 */         this.o.a(this, (byte)15);
/* 120:    */       }
/* 121:    */     }
/* 122:142 */     super.m();
/* 123:    */   }
/* 124:    */   
/* 125:    */   public void a(byte paramByte)
/* 126:    */   {
/* 127:147 */     if (paramByte == 15) {
/* 128:148 */       for (int i = 0; i < this.V.nextInt(35) + 10; i++) {
/* 129:149 */         this.o.a(ew.r, this.s + this.V.nextGaussian() * 0.1299999952316284D, aQ().e + 0.5D + this.V.nextGaussian() * 0.1299999952316284D, this.u + this.V.nextGaussian() * 0.1299999952316284D, 0.0D, 0.0D, 0.0D, new int[0]);
/* 130:    */       }
/* 131:    */     } else {
/* 132:152 */       super.a(paramByte);
/* 133:    */     }
/* 134:    */   }
/* 135:    */   
/* 136:    */   protected float c(wh paramwh, float paramFloat)
/* 137:    */   {
/* 138:158 */     paramFloat = super.c(paramwh, paramFloat);
/* 139:160 */     if (paramwh.j() == this) {
/* 140:161 */       paramFloat = 0.0F;
/* 141:    */     }
/* 142:163 */     if (paramwh.s()) {
/* 143:164 */       paramFloat = (float)(paramFloat * 0.15D);
/* 144:    */     }
/* 145:167 */     return paramFloat;
/* 146:    */   }
/* 147:    */   
/* 148:    */   protected void b(boolean paramBoolean, int paramInt)
/* 149:    */   {
/* 150:172 */     int i = this.V.nextInt(3) + 1;
/* 151:173 */     for (int j = 0; j < i; j++)
/* 152:    */     {
/* 153:174 */       int k = this.V.nextInt(3);
/* 154:175 */       alq localalq = bk[this.V.nextInt(bk.length)];
/* 155:176 */       if (paramInt > 0) {
/* 156:177 */         k += this.V.nextInt(paramInt + 1);
/* 157:    */       }
/* 158:180 */       for (int m = 0; m < k; m++) {
/* 159:181 */         a(localalq, 1);
/* 160:    */       }
/* 161:    */     }
/* 162:    */   }
/* 163:    */   
/* 164:    */   public void a(xm paramxm, float paramFloat)
/* 165:    */   {
/* 166:188 */     if (n()) {
/* 167:189 */       return;
/* 168:    */     }
/* 169:192 */     ahv localahv = new ahv(this.o, this, 32732);
/* 170:193 */     double d1 = paramxm.t + paramxm.aR() - 1.100000023841858D;
/* 171:194 */     localahv.z -= -20.0F;
/* 172:195 */     double d2 = paramxm.s + paramxm.v - this.s;
/* 173:196 */     double d3 = d1 - this.t;
/* 174:197 */     double d4 = paramxm.u + paramxm.x - this.u;
/* 175:198 */     float f = uv.a(d2 * d2 + d4 * d4);
/* 176:200 */     if ((f >= 8.0F) && (!paramxm.a(wp.d))) {
/* 177:201 */       localahv.a(32698);
/* 178:202 */     } else if ((paramxm.bm() >= 8.0F) && (!paramxm.a(wp.u))) {
/* 179:203 */       localahv.a(32660);
/* 180:204 */     } else if ((f <= 3.0F) && (!paramxm.a(wp.t)) && (this.V.nextFloat() < 0.25F)) {
/* 181:205 */       localahv.a(32696);
/* 182:    */     }
/* 183:208 */     localahv.c(d2, d3 + f * 0.2F, d4, 0.75F, 8.0F);
/* 184:    */     
/* 185:210 */     this.o.d(localahv);
/* 186:    */   }
/* 187:    */   
/* 188:    */   public float aR()
/* 189:    */   {
/* 190:215 */     return 1.62F;
/* 191:    */   }
/* 192:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     agi
 * JD-Core Version:    0.7.0.1
 */