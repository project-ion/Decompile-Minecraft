/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.ArrayList;
/*   3:    */ import java.util.List;
/*   4:    */ 
/*   5:    */ public class aoi
/*   6:    */   implements aoo
/*   7:    */ {
/*   8:    */   private amj a;
/*   9:    */   
/*  10:    */   public boolean a(ain paramain, aqu paramaqu)
/*  11:    */   {
/*  12: 22 */     this.a = null;
/*  13:    */     
/*  14: 24 */     int i = 0;
/*  15: 25 */     int j = 0;
/*  16: 26 */     int k = 0;
/*  17: 27 */     int m = 0;
/*  18: 28 */     int n = 0;
/*  19: 29 */     int i1 = 0;
/*  20:    */     Object localObject2;
/*  21: 31 */     for (int i2 = 0; i2 < paramain.n_(); i2++)
/*  22:    */     {
/*  23: 32 */       localObject2 = paramain.a(i2);
/*  24: 33 */       if (localObject2 != null) {
/*  25: 37 */         if (((amj)localObject2).b() == amk.H) {
/*  26: 38 */           j++;
/*  27: 39 */         } else if (((amj)localObject2).b() == amk.cc) {
/*  28: 40 */           m++;
/*  29: 41 */         } else if (((amj)localObject2).b() == amk.aW) {
/*  30: 42 */           k++;
/*  31: 43 */         } else if (((amj)localObject2).b() == amk.aK) {
/*  32: 44 */           i++;
/*  33: 45 */         } else if (((amj)localObject2).b() == amk.aT) {
/*  34: 47 */           n++;
/*  35: 48 */         } else if (((amj)localObject2).b() == amk.i) {
/*  36: 50 */           n++;
/*  37: 51 */         } else if (((amj)localObject2).b() == amk.bL) {
/*  38: 53 */           i1++;
/*  39: 54 */         } else if (((amj)localObject2).b() == amk.G) {
/*  40: 56 */           i1++;
/*  41: 57 */         } else if (((amj)localObject2).b() == amk.bx) {
/*  42: 59 */           i1++;
/*  43: 60 */         } else if (((amj)localObject2).b() == amk.bX) {
/*  44: 62 */           i1++;
/*  45:    */         } else {
/*  46: 64 */           return false;
/*  47:    */         }
/*  48:    */       }
/*  49:    */     }
/*  50: 67 */     n += k + i1;
/*  51: 69 */     if ((j > 3) || (i > 1)) {
/*  52: 70 */       return false;
/*  53:    */     }
/*  54:    */     Object localObject1;
/*  55: 74 */     if ((j >= 1) && (i == 1) && (n == 0))
/*  56:    */     {
/*  57: 75 */       this.a = new amj(amk.cb);
/*  58: 76 */       if (m > 0)
/*  59:    */       {
/*  60: 77 */         localObject1 = new fn();
/*  61: 78 */         localObject2 = new fn();
/*  62: 79 */         fv localfv = new fv();
/*  63: 81 */         for (int i5 = 0; i5 < paramain.n_(); i5++)
/*  64:    */         {
/*  65: 82 */           amj localamj2 = paramain.a(i5);
/*  66: 83 */           if ((localamj2 != null) && (localamj2.b() == amk.cc)) {
/*  67: 87 */             if ((localamj2.n()) && (localamj2.o().b("Explosion", 10))) {
/*  68: 88 */               localfv.a(localamj2.o().m("Explosion"));
/*  69:    */             }
/*  70:    */           }
/*  71:    */         }
/*  72: 92 */         ((fn)localObject2).a("Explosions", localfv);
/*  73: 93 */         ((fn)localObject2).a("Flight", (byte)j);
/*  74: 94 */         ((fn)localObject1).a("Fireworks", (gd)localObject2);
/*  75: 95 */         this.a.d((fn)localObject1);
/*  76:    */       }
/*  77: 97 */       return true;
/*  78:    */     }
/*  79:100 */     if ((j == 1) && (i == 0) && (m == 0) && (k > 0) && (i1 <= 1))
/*  80:    */     {
/*  81:101 */       this.a = new amj(amk.cc);
/*  82:102 */       localObject1 = new fn();
/*  83:103 */       localObject2 = new fn();
/*  84:    */       
/*  85:105 */       byte b = 0;
/*  86:    */       
/*  87:107 */       ArrayList localArrayList = Lists.newArrayList();
/*  88:108 */       for (int i6 = 0; i6 < paramain.n_(); i6++)
/*  89:    */       {
/*  90:109 */         amj localamj3 = paramain.a(i6);
/*  91:110 */         if (localamj3 != null) {
/*  92:114 */           if (localamj3.b() == amk.aW) {
/*  93:115 */             localArrayList.add(Integer.valueOf(akw.a[(localamj3.i() & 0xF)]));
/*  94:116 */           } else if (localamj3.b() == amk.aT) {
/*  95:118 */             ((fn)localObject2).a("Flicker", true);
/*  96:119 */           } else if (localamj3.b() == amk.i) {
/*  97:121 */             ((fn)localObject2).a("Trail", true);
/*  98:122 */           } else if (localamj3.b() == amk.bL) {
/*  99:123 */             b = 1;
/* 100:124 */           } else if (localamj3.b() == amk.G) {
/* 101:125 */             b = 4;
/* 102:126 */           } else if (localamj3.b() == amk.bx) {
/* 103:127 */             b = 2;
/* 104:128 */           } else if (localamj3.b() == amk.bX) {
/* 105:129 */             b = 3;
/* 106:    */           }
/* 107:    */         }
/* 108:    */       }
/* 109:132 */       int[] arrayOfInt2 = new int[localArrayList.size()];
/* 110:133 */       for (int i7 = 0; i7 < arrayOfInt2.length; i7++) {
/* 111:134 */         arrayOfInt2[i7] = ((Integer)localArrayList.get(i7)).intValue();
/* 112:    */       }
/* 113:136 */       ((fn)localObject2).a("Colors", arrayOfInt2);
/* 114:137 */       ((fn)localObject2).a("Type", b);
/* 115:138 */       ((fn)localObject1).a("Explosion", (gd)localObject2);
/* 116:139 */       this.a.d((fn)localObject1);
/* 117:140 */       return true;
/* 118:    */     }
/* 119:143 */     if ((j == 0) && (i == 0) && (m == 1) && (k > 0) && (k == n))
/* 120:    */     {
/* 121:144 */       localObject1 = Lists.newArrayList();
/* 122:145 */       for (int i3 = 0; i3 < paramain.n_(); i3++)
/* 123:    */       {
/* 124:146 */         amj localamj1 = paramain.a(i3);
/* 125:147 */         if (localamj1 != null) {
/* 126:151 */           if (localamj1.b() == amk.aW)
/* 127:    */           {
/* 128:152 */             ((List)localObject1).add(Integer.valueOf(akw.a[(localamj1.i() & 0xF)]));
/* 129:    */           }
/* 130:153 */           else if (localamj1.b() == amk.cc)
/* 131:    */           {
/* 132:154 */             this.a = localamj1.k();
/* 133:155 */             this.a.b = 1;
/* 134:    */           }
/* 135:    */         }
/* 136:    */       }
/* 137:158 */       int[] arrayOfInt1 = new int[((List)localObject1).size()];
/* 138:159 */       for (int i4 = 0; i4 < arrayOfInt1.length; i4++) {
/* 139:160 */         arrayOfInt1[i4] = ((Integer)((List)localObject1).get(i4)).intValue();
/* 140:    */       }
/* 141:162 */       if ((this.a != null) && (this.a.n()))
/* 142:    */       {
/* 143:163 */         fn localfn = this.a.o().m("Explosion");
/* 144:164 */         if (localfn == null) {
/* 145:165 */           return false;
/* 146:    */         }
/* 147:167 */         localfn.a("FadeColors", arrayOfInt1);
/* 148:    */       }
/* 149:    */       else
/* 150:    */       {
/* 151:169 */         return false;
/* 152:    */       }
/* 153:171 */       return true;
/* 154:    */     }
/* 155:174 */     return false;
/* 156:    */   }
/* 157:    */   
/* 158:    */   public amj a(ain paramain)
/* 159:    */   {
/* 160:180 */     return this.a.k();
/* 161:    */   }
/* 162:    */   
/* 163:    */   public int a()
/* 164:    */   {
/* 165:185 */     return 10;
/* 166:    */   }
/* 167:    */   
/* 168:    */   public amj b()
/* 169:    */   {
/* 170:191 */     return this.a;
/* 171:    */   }
/* 172:    */   
/* 173:    */   public amj[] b(ain paramain)
/* 174:    */   {
/* 175:196 */     amj[] arrayOfamj = new amj[paramain.n_()];
/* 176:198 */     for (int i = 0; i < arrayOfamj.length; i++)
/* 177:    */     {
/* 178:199 */       amj localamj = paramain.a(i);
/* 179:200 */       if ((localamj != null) && (localamj.b().r())) {
/* 180:201 */         arrayOfamj[i] = new amj(localamj.b().q());
/* 181:    */       }
/* 182:    */     }
/* 183:205 */     return arrayOfamj;
/* 184:    */   }
/* 185:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     aoi
 * JD-Core Version:    0.7.0.1
 */