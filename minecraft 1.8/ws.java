/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public abstract class ws
/*   4:    */   extends xu
/*   5:    */ {
/*   6:    */   protected int a;
/*   7:    */   protected int b;
/*   8:    */   protected int c;
/*   9:    */   
/*  10:    */   public ws(aqu paramaqu)
/*  11:    */   {
/*  12: 24 */     super(paramaqu);
/*  13:    */   }
/*  14:    */   
/*  15:    */   public abstract ws a(ws paramws);
/*  16:    */   
/*  17:    */   public boolean a(ahd paramahd)
/*  18:    */   {
/*  19: 31 */     amj localamj = paramahd.bg.h();
/*  20: 33 */     if ((localamj != null) && (localamj.b() == amk.bJ))
/*  21:    */     {
/*  22: 34 */       if (!this.o.D)
/*  23:    */       {
/*  24: 35 */         Class localClass = xb.a(localamj.i());
/*  25: 36 */         if ((localClass != null) && (getClass() == localClass))
/*  26:    */         {
/*  27: 37 */           ws localws = a(this);
/*  28: 38 */           if (localws != null)
/*  29:    */           {
/*  30: 39 */             localws.b(-24000);
/*  31: 40 */             localws.b(this.s, this.t, this.u, 0.0F, 0.0F);
/*  32:    */             
/*  33: 42 */             this.o.d(localws);
/*  34: 44 */             if (localamj.s()) {
/*  35: 45 */               localws.a(localamj.q());
/*  36:    */             }
/*  37: 48 */             if (!paramahd.by.d)
/*  38:    */             {
/*  39: 49 */               localamj.b -= 1;
/*  40: 51 */               if (localamj.b <= 0) {
/*  41: 52 */                 paramahd.bg.a(paramahd.bg.c, null);
/*  42:    */               }
/*  43:    */             }
/*  44:    */           }
/*  45:    */         }
/*  46:    */       }
/*  47: 58 */       return true;
/*  48:    */     }
/*  49: 60 */     return false;
/*  50:    */   }
/*  51:    */   
/*  52:    */   protected void h()
/*  53:    */   {
/*  54: 65 */     super.h();
/*  55: 66 */     this.ac.a(12, Byte.valueOf((byte)0));
/*  56:    */   }
/*  57:    */   
/*  58:    */   public int l()
/*  59:    */   {
/*  60: 70 */     if (this.o.D) {
/*  61: 71 */       return this.ac.a(12);
/*  62:    */     }
/*  63: 73 */     return this.a;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void a(int paramInt, boolean paramBoolean)
/*  67:    */   {
/*  68: 78 */     int i = l();
/*  69: 79 */     int j = i;
/*  70: 80 */     i += paramInt * 20;
/*  71: 81 */     if (i > 0)
/*  72:    */     {
/*  73: 82 */       i = 0;
/*  74: 83 */       if (j < 0) {
/*  75: 84 */         n();
/*  76:    */       }
/*  77:    */     }
/*  78: 87 */     int k = i - j;
/*  79: 88 */     b(i);
/*  80: 89 */     if (paramBoolean)
/*  81:    */     {
/*  82: 90 */       this.b += k;
/*  83: 91 */       if (this.c == 0) {
/*  84: 92 */         this.c = 40;
/*  85:    */       }
/*  86:    */     }
/*  87: 95 */     if (l() == 0) {
/*  88: 96 */       b(this.b);
/*  89:    */     }
/*  90:    */   }
/*  91:    */   
/*  92:    */   public void a(int paramInt)
/*  93:    */   {
/*  94:101 */     a(paramInt, false);
/*  95:    */   }
/*  96:    */   
/*  97:    */   public void b(int paramInt)
/*  98:    */   {
/*  99:105 */     this.ac.b(12, Byte.valueOf((byte)uv.a(paramInt, -1, 1)));
/* 100:106 */     this.a = paramInt;
/* 101:107 */     a(i_());
/* 102:    */   }
/* 103:    */   
/* 104:    */   public void b(fn paramfn)
/* 105:    */   {
/* 106:112 */     super.b(paramfn);
/* 107:113 */     paramfn.a("Age", l());
/* 108:114 */     paramfn.a("ForcedAge", this.b);
/* 109:    */   }
/* 110:    */   
/* 111:    */   public void a(fn paramfn)
/* 112:    */   {
/* 113:119 */     super.a(paramfn);
/* 114:120 */     b(paramfn.f("Age"));
/* 115:121 */     this.b = paramfn.f("ForcedAge");
/* 116:    */   }
/* 117:    */   
/* 118:    */   public void m()
/* 119:    */   {
/* 120:126 */     super.m();
/* 121:128 */     if (this.o.D)
/* 122:    */     {
/* 123:129 */       if (this.c > 0)
/* 124:    */       {
/* 125:130 */         if (this.c % 4 == 0) {
/* 126:131 */           this.o.a(ew.v, this.s + this.V.nextFloat() * this.J * 2.0F - this.J, this.t + 0.5D + this.V.nextFloat() * this.K, this.u + this.V.nextFloat() * this.J * 2.0F - this.J, 0.0D, 0.0D, 0.0D, new int[0]);
/* 127:    */         }
/* 128:133 */         this.c -= 1;
/* 129:    */       }
/* 130:135 */       a(i_());
/* 131:    */     }
/* 132:    */     else
/* 133:    */     {
/* 134:137 */       int i = l();
/* 135:138 */       if (i < 0)
/* 136:    */       {
/* 137:139 */         i++;
/* 138:140 */         b(i);
/* 139:141 */         if (i == 0) {
/* 140:142 */           n();
/* 141:    */         }
/* 142:    */       }
/* 143:144 */       else if (i > 0)
/* 144:    */       {
/* 145:145 */         i--;
/* 146:146 */         b(i);
/* 147:    */       }
/* 148:    */     }
/* 149:    */   }
/* 150:    */   
/* 151:    */   protected void n() {}
/* 152:    */   
/* 153:    */   public boolean i_()
/* 154:    */   {
/* 155:156 */     return l() < 0;
/* 156:    */   }
/* 157:    */   
/* 158:    */   public void a(boolean paramBoolean)
/* 159:    */   {
/* 160:160 */     a(paramBoolean ? 0.5F : 1.0F);
/* 161:    */   }
/* 162:    */   
/* 163:163 */   private float bk = -1.0F;
/* 164:    */   private float bl;
/* 165:    */   
/* 166:    */   protected final void a(float paramFloat1, float paramFloat2)
/* 167:    */   {
/* 168:168 */     int i = this.bk > 0.0F ? 1 : 0;
/* 169:    */     
/* 170:170 */     this.bk = paramFloat1;
/* 171:171 */     this.bl = paramFloat2;
/* 172:173 */     if (i == 0) {
/* 173:174 */       a(1.0F);
/* 174:    */     }
/* 175:    */   }
/* 176:    */   
/* 177:    */   protected final void a(float paramFloat)
/* 178:    */   {
/* 179:179 */     super.a(this.bk * paramFloat, this.bl * paramFloat);
/* 180:    */   }
/* 181:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ws
 * JD-Core Version:    0.7.0.1
 */