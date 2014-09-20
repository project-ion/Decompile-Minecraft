/*   1:    */ class aoe
/*   2:    */   implements aoo
/*   3:    */ {
/*   4:    */   public boolean a(ain paramain, aqu paramaqu)
/*   5:    */   {
/*   6:149 */     int i = 0;
/*   7:150 */     for (int j = 0; j < paramain.n_(); j++)
/*   8:    */     {
/*   9:151 */       amj localamj = paramain.a(j);
/*  10:152 */       if ((localamj != null) && (localamj.b() == amk.cE))
/*  11:    */       {
/*  12:156 */         if (i != 0) {
/*  13:157 */           return false;
/*  14:    */         }
/*  15:159 */         if (bci.c(localamj) >= 6) {
/*  16:161 */           return false;
/*  17:    */         }
/*  18:163 */         i = 1;
/*  19:    */       }
/*  20:    */     }
/*  21:165 */     if (i == 0) {
/*  22:166 */       return false;
/*  23:    */     }
/*  24:169 */     return c(paramain) != null;
/*  25:    */   }
/*  26:    */   
/*  27:    */   public amj a(ain paramain)
/*  28:    */   {
/*  29:175 */     amj localamj1 = null;
/*  30:176 */     for (int i = 0; i < paramain.n_(); i++)
/*  31:    */     {
/*  32:177 */       amj localamj2 = paramain.a(i);
/*  33:178 */       if (localamj2 != null) {
/*  34:181 */         if (localamj2.b() == amk.cE)
/*  35:    */         {
/*  36:182 */           localamj1 = localamj2.k();
/*  37:183 */           localamj1.b = 1;
/*  38:184 */           break;
/*  39:    */         }
/*  40:    */       }
/*  41:    */     }
/*  42:189 */     bcj localbcj = c(paramain);
/*  43:190 */     if (localbcj != null)
/*  44:    */     {
/*  45:192 */       int j = 0;
/*  46:193 */       for (int k = 0; k < paramain.n_(); k++)
/*  47:    */       {
/*  48:194 */         localObject = paramain.a(k);
/*  49:195 */         if ((localObject != null) && (((amj)localObject).b() == amk.aW))
/*  50:    */         {
/*  51:198 */           j = ((amj)localObject).i();
/*  52:199 */           break;
/*  53:    */         }
/*  54:    */       }
/*  55:202 */       fn localfn1 = localamj1.a("BlockEntityTag", true);
/*  56:203 */       Object localObject = null;
/*  57:204 */       if (localfn1.b("Patterns", 9))
/*  58:    */       {
/*  59:205 */         localObject = localfn1.c("Patterns", 10);
/*  60:    */       }
/*  61:    */       else
/*  62:    */       {
/*  63:207 */         localObject = new fv();
/*  64:208 */         localfn1.a("Patterns", (gd)localObject);
/*  65:    */       }
/*  66:210 */       fn localfn2 = new fn();
/*  67:211 */       localfn2.a("Pattern", localbcj.b());
/*  68:212 */       localfn2.a("Color", j);
/*  69:213 */       ((fv)localObject).a(localfn2);
/*  70:    */     }
/*  71:216 */     return localamj1;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public int a()
/*  75:    */   {
/*  76:222 */     return 10;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public amj b()
/*  80:    */   {
/*  81:229 */     return null;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public amj[] b(ain paramain)
/*  85:    */   {
/*  86:234 */     amj[] arrayOfamj = new amj[paramain.n_()];
/*  87:236 */     for (int i = 0; i < arrayOfamj.length; i++)
/*  88:    */     {
/*  89:237 */       amj localamj = paramain.a(i);
/*  90:238 */       if ((localamj != null) && (localamj.b().r())) {
/*  91:239 */         arrayOfamj[i] = new amj(localamj.b().q());
/*  92:    */       }
/*  93:    */     }
/*  94:243 */     return arrayOfamj;
/*  95:    */   }
/*  96:    */   
/*  97:    */   private bcj c(ain paramain)
/*  98:    */   {
/*  99:248 */     for (bcj localbcj : ) {
/* 100:249 */       if (localbcj.d())
/* 101:    */       {
/* 102:252 */         int k = 1;
/* 103:    */         int m;
/* 104:    */         int n;
/* 105:    */         int i1;
/* 106:253 */         if (localbcj.e())
/* 107:    */         {
/* 108:255 */           m = 0;
/* 109:256 */           n = 0;
/* 110:257 */           for (i1 = 0; (i1 < paramain.n_()) && (k != 0); i1++)
/* 111:    */           {
/* 112:258 */             amj localamj1 = paramain.a(i1);
/* 113:259 */             if ((localamj1 != null) && (localamj1.b() != amk.cE)) {
/* 114:262 */               if (localamj1.b() == amk.aW)
/* 115:    */               {
/* 116:263 */                 if (n != 0)
/* 117:    */                 {
/* 118:265 */                   k = 0;
/* 119:266 */                   break;
/* 120:    */                 }
/* 121:268 */                 n = 1;
/* 122:    */               }
/* 123:269 */               else if ((m == 0) && (localamj1.a(localbcj.f())))
/* 124:    */               {
/* 125:270 */                 m = 1;
/* 126:    */               }
/* 127:    */               else
/* 128:    */               {
/* 129:272 */                 k = 0;
/* 130:273 */                 break;
/* 131:    */               }
/* 132:    */             }
/* 133:    */           }
/* 134:276 */           if (m == 0) {
/* 135:277 */             k = 0;
/* 136:    */           }
/* 137:    */         }
/* 138:279 */         else if (paramain.n_() == localbcj.c().length * localbcj.c()[0].length())
/* 139:    */         {
/* 140:281 */           m = -1;
/* 141:282 */           for (n = 0; (n < paramain.n_()) && (k != 0); n++)
/* 142:    */           {
/* 143:283 */             i1 = n / 3;
/* 144:284 */             int i2 = n % 3;
/* 145:    */             
/* 146:286 */             amj localamj2 = paramain.a(n);
/* 147:287 */             if ((localamj2 == null) || (localamj2.b() == amk.cE))
/* 148:    */             {
/* 149:288 */               if (localbcj.c()[i1].charAt(i2) != ' ')
/* 150:    */               {
/* 151:289 */                 k = 0;
/* 152:290 */                 break;
/* 153:    */               }
/* 154:    */             }
/* 155:    */             else
/* 156:    */             {
/* 157:294 */               if (localamj2.b() != amk.aW)
/* 158:    */               {
/* 159:295 */                 k = 0;
/* 160:296 */                 break;
/* 161:    */               }
/* 162:298 */               if ((m != -1) && (m != localamj2.i()))
/* 163:    */               {
/* 164:299 */                 k = 0;
/* 165:300 */                 break;
/* 166:    */               }
/* 167:302 */               if (localbcj.c()[i1].charAt(i2) == ' ')
/* 168:    */               {
/* 169:303 */                 k = 0;
/* 170:304 */                 break;
/* 171:    */               }
/* 172:306 */               m = localamj2.i();
/* 173:    */             }
/* 174:    */           }
/* 175:    */         }
/* 176:    */         else
/* 177:    */         {
/* 178:309 */           k = 0;
/* 179:    */         }
/* 180:311 */         if (k != 0) {
/* 181:312 */           return localbcj;
/* 182:    */         }
/* 183:    */       }
/* 184:    */     }
/* 185:315 */     return null;
/* 186:    */   }
/* 187:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     aoe
 * JD-Core Version:    0.7.0.1
 */