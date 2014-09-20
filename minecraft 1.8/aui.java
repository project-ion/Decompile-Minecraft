/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class aui
/*   5:    */   extends atr
/*   6:    */ {
/*   7: 27 */   public static final bew a = bew.a("level", 0, 3);
/*   8:    */   
/*   9:    */   public aui()
/*  10:    */   {
/*  11: 33 */     super(bof.f);
/*  12: 34 */     j(this.L.b().a(a, Integer.valueOf(0)));
/*  13:    */   }
/*  14:    */   
/*  15:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, brt parambrt, List paramList, wv paramwv)
/*  16:    */   {
/*  17: 39 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.3125F, 1.0F);
/*  18: 40 */     super.a(paramaqu, paramdt, parambec, parambrt, paramList, paramwv);
/*  19: 41 */     float f = 0.125F;
/*  20: 42 */     a(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
/*  21: 43 */     super.a(paramaqu, paramdt, parambec, parambrt, paramList, paramwv);
/*  22: 44 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
/*  23: 45 */     super.a(paramaqu, paramdt, parambec, parambrt, paramList, paramwv);
/*  24: 46 */     a(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*  25: 47 */     super.a(paramaqu, paramdt, parambec, parambrt, paramList, paramwv);
/*  26: 48 */     a(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
/*  27: 49 */     super.a(paramaqu, paramdt, parambec, parambrt, paramList, paramwv);
/*  28:    */     
/*  29: 51 */     h();
/*  30:    */   }
/*  31:    */   
/*  32:    */   public void h()
/*  33:    */   {
/*  34: 56 */     a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*  35:    */   }
/*  36:    */   
/*  37:    */   public boolean c()
/*  38:    */   {
/*  39: 61 */     return false;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public boolean d()
/*  43:    */   {
/*  44: 66 */     return false;
/*  45:    */   }
/*  46:    */   
/*  47:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, wv paramwv)
/*  48:    */   {
/*  49: 71 */     int i = ((Integer)parambec.b(a)).intValue();
/*  50: 72 */     float f = paramdt.o() + (6.0F + 3 * i) / 16.0F;
/*  51: 74 */     if ((!paramaqu.D) && (paramwv.au()) && (i > 0) && (paramwv.aQ().b <= f))
/*  52:    */     {
/*  53: 75 */       paramwv.N();
/*  54:    */       
/*  55: 77 */       a(paramaqu, paramdt, parambec, i - 1);
/*  56:    */     }
/*  57:    */   }
/*  58:    */   
/*  59:    */   public boolean a(aqu paramaqu, dt paramdt, bec parambec, ahd paramahd, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/*  60:    */   {
/*  61: 83 */     if (paramaqu.D) {
/*  62: 84 */       return true;
/*  63:    */     }
/*  64: 87 */     amj localamj = paramahd.bg.h();
/*  65: 88 */     if (localamj == null) {
/*  66: 89 */       return true;
/*  67:    */     }
/*  68: 92 */     int i = ((Integer)parambec.b(a)).intValue();
/*  69: 93 */     alq localalq = localamj.b();
/*  70: 94 */     if (localalq == amk.ax)
/*  71:    */     {
/*  72: 95 */       if (i < 3)
/*  73:    */       {
/*  74: 96 */         if (!paramahd.by.d) {
/*  75: 97 */           paramahd.bg.a(paramahd.bg.c, new amj(amk.aw));
/*  76:    */         }
/*  77:100 */         a(paramaqu, paramdt, parambec, 3);
/*  78:    */       }
/*  79:102 */       return true;
/*  80:    */     }
/*  81:    */     Object localObject;
/*  82:105 */     if (localalq == amk.bA)
/*  83:    */     {
/*  84:106 */       if (i > 0)
/*  85:    */       {
/*  86:107 */         if (!paramahd.by.d)
/*  87:    */         {
/*  88:108 */           localObject = new amj(amk.bz, 1, 0);
/*  89:109 */           if (!paramahd.bg.a((amj)localObject)) {
/*  90:110 */             paramaqu.d(new adw(paramaqu, paramdt.n() + 0.5D, paramdt.o() + 1.5D, paramdt.p() + 0.5D, (amj)localObject));
/*  91:111 */           } else if ((paramahd instanceof qw)) {
/*  92:112 */             ((qw)paramahd).a(paramahd.bh);
/*  93:    */           }
/*  94:115 */           localamj.b -= 1;
/*  95:116 */           if (localamj.b <= 0) {
/*  96:117 */             paramahd.bg.a(paramahd.bg.c, null);
/*  97:    */           }
/*  98:    */         }
/*  99:121 */         a(paramaqu, paramdt, parambec, i - 1);
/* 100:    */       }
/* 101:123 */       return true;
/* 102:    */     }
/* 103:126 */     if ((i > 0) && ((localalq instanceof ajn)))
/* 104:    */     {
/* 105:127 */       localObject = (ajn)localalq;
/* 106:128 */       if ((((ajn)localObject).w_() == ajp.a) && (((ajn)localObject).d_(localamj)))
/* 107:    */       {
/* 108:129 */         ((ajn)localObject).c(localamj);
/* 109:130 */         a(paramaqu, paramdt, parambec, i - 1);
/* 110:131 */         return true;
/* 111:    */       }
/* 112:    */     }
/* 113:135 */     if ((i > 0) && ((localalq instanceof ajs)) && 
/* 114:136 */       (bci.c(localamj) > 0))
/* 115:    */     {
/* 116:137 */       localObject = localamj.k();
/* 117:138 */       ((amj)localObject).b = 1;
/* 118:139 */       bci.e((amj)localObject);
/* 119:141 */       if ((localamj.b > 1) || (paramahd.by.d))
/* 120:    */       {
/* 121:143 */         if (!paramahd.bg.a((amj)localObject)) {
/* 122:144 */           paramaqu.d(new adw(paramaqu, paramdt.n() + 0.5D, paramdt.o() + 1.5D, paramdt.p() + 0.5D, (amj)localObject));
/* 123:145 */         } else if ((paramahd instanceof qw)) {
/* 124:146 */           ((qw)paramahd).a(paramahd.bh);
/* 125:    */         }
/* 126:148 */         if (!paramahd.by.d) {
/* 127:149 */           localamj.b -= 1;
/* 128:    */         }
/* 129:    */       }
/* 130:    */       else
/* 131:    */       {
/* 132:153 */         paramahd.bg.a(paramahd.bg.c, (amj)localObject);
/* 133:    */       }
/* 134:156 */       if (!paramahd.by.d) {
/* 135:157 */         a(paramaqu, paramdt, parambec, i - 1);
/* 136:    */       }
/* 137:159 */       return true;
/* 138:    */     }
/* 139:163 */     return false;
/* 140:    */   }
/* 141:    */   
/* 142:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, int paramInt)
/* 143:    */   {
/* 144:167 */     paramaqu.a(paramdt, parambec.a(a, Integer.valueOf(uv.a(paramInt, 0, 3))), 2);
/* 145:168 */     paramaqu.e(paramdt, this);
/* 146:    */   }
/* 147:    */   
/* 148:    */   public void k(aqu paramaqu, dt paramdt)
/* 149:    */   {
/* 150:173 */     if (paramaqu.s.nextInt(20) != 1) {
/* 151:174 */       return;
/* 152:    */     }
/* 153:177 */     bec localbec = paramaqu.p(paramdt);
/* 154:178 */     if (((Integer)localbec.b(a)).intValue() < 3) {
/* 155:179 */       paramaqu.a(paramdt, localbec.a(a), 2);
/* 156:    */     }
/* 157:    */   }
/* 158:    */   
/* 159:    */   public alq a(bec parambec, Random paramRandom, int paramInt)
/* 160:    */   {
/* 161:186 */     return amk.bG;
/* 162:    */   }
/* 163:    */   
/* 164:    */   public alq b(aqu paramaqu, dt paramdt)
/* 165:    */   {
/* 166:191 */     return amk.bG;
/* 167:    */   }
/* 168:    */   
/* 169:    */   public boolean N()
/* 170:    */   {
/* 171:196 */     return true;
/* 172:    */   }
/* 173:    */   
/* 174:    */   public int l(aqu paramaqu, dt paramdt)
/* 175:    */   {
/* 176:201 */     return ((Integer)paramaqu.p(paramdt).b(a)).intValue();
/* 177:    */   }
/* 178:    */   
/* 179:    */   public bec a(int paramInt)
/* 180:    */   {
/* 181:206 */     return P().a(a, Integer.valueOf(paramInt));
/* 182:    */   }
/* 183:    */   
/* 184:    */   public int c(bec parambec)
/* 185:    */   {
/* 186:212 */     return ((Integer)parambec.b(a)).intValue();
/* 187:    */   }
/* 188:    */   
/* 189:    */   protected bed e()
/* 190:    */   {
/* 191:217 */     return new bed(this, new bex[] { a });
/* 192:    */   }
/* 193:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     aui
 * JD-Core Version:    0.7.0.1
 */