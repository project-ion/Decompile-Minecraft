/*   1:    */ import com.google.common.collect.Sets;
/*   2:    */ import java.lang.reflect.Constructor;
/*   3:    */ import java.util.Iterator;
/*   4:    */ import java.util.List;
/*   5:    */ import java.util.Random;
/*   6:    */ import java.util.Set;
/*   7:    */ 
/*   8:    */ public final class arg
/*   9:    */ {
/*  10: 28 */   private static final int a = (int)Math.pow(17.0D, 2.0D);
/*  11: 30 */   private final Set b = Sets.newHashSet();
/*  12:    */   
/*  13:    */   public int a(qt paramqt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
/*  14:    */   {
/*  15: 33 */     if ((!paramBoolean1) && (!paramBoolean2)) {
/*  16: 34 */       return 0;
/*  17:    */     }
/*  18: 37 */     this.b.clear();
/*  19: 38 */     int i = 0;
/*  20: 40 */     for (Iterator localIterator = paramqt.j.iterator(); localIterator.hasNext();)
/*  21:    */     {
/*  22: 40 */       localObject1 = (ahd)localIterator.next();
/*  23: 41 */       if (!((ahd)localObject1).v())
/*  24:    */       {
/*  25: 42 */         int k = uv.c(((ahd)localObject1).s / 16.0D);
/*  26: 43 */         m = uv.c(((ahd)localObject1).u / 16.0D);
/*  27: 44 */         n = 8;
/*  28: 46 */         for (int i1 = -n; i1 <= n; i1++) {
/*  29: 47 */           for (i2 = -n; i2 <= n; i2++)
/*  30:    */           {
/*  31: 48 */             i3 = (i1 == -n) || (i1 == n) || (i2 == -n) || (i2 == n) ? 1 : 0;
/*  32: 49 */             localObject2 = new aqm(i1 + k, i2 + m);
/*  33: 50 */             if (!this.b.contains(localObject2))
/*  34:    */             {
/*  35: 51 */               i++;
/*  36: 52 */               if ((i3 == 0) && (paramqt.af().a((aqm)localObject2))) {
/*  37: 53 */                 this.b.add(localObject2);
/*  38:    */               }
/*  39:    */             }
/*  40:    */           }
/*  41:    */         }
/*  42:    */       }
/*  43:    */     }
/*  44:    */     int m;
/*  45:    */     int n;
/*  46:    */     int i2;
/*  47:    */     int i3;
/*  48:    */     Object localObject2;
/*  49: 61 */     int j = 0;
/*  50: 62 */     Object localObject1 = paramqt.M();
/*  51:    */     xp localxp;
/*  52:    */     label846:
/*  53:    */     label852:
/*  54: 64 */     for (localxp : xp.values()) {
/*  55: 65 */       if ((!localxp.d()) || (paramBoolean2)) {
/*  56: 67 */         if ((localxp.d()) || (paramBoolean1)) {
/*  57: 69 */           if ((!localxp.e()) || (paramBoolean3))
/*  58:    */           {
/*  59: 73 */             i2 = paramqt.a(localxp.a());
/*  60: 74 */             i3 = localxp.b() * i / a;
/*  61: 75 */             if (i2 <= i3) {
/*  62: 79 */               for (localObject2 = this.b.iterator(); ((Iterator)localObject2).hasNext();)
/*  63:    */               {
/*  64: 79 */                 aqm localaqm = (aqm)((Iterator)localObject2).next();
/*  65: 80 */                 dt localdt1 = a(paramqt, localaqm.a, localaqm.b);
/*  66: 81 */                 int i4 = localdt1.n();
/*  67: 82 */                 int i5 = localdt1.o();
/*  68: 83 */                 int i6 = localdt1.p();
/*  69:    */                 
/*  70: 85 */                 atr localatr = paramqt.p(localdt1).c();
/*  71: 86 */                 if (!localatr.t())
/*  72:    */                 {
/*  73: 90 */                   int i7 = 0;
/*  74: 92 */                   for (int i8 = 0;; i8++)
/*  75:    */                   {
/*  76: 92 */                     if (i8 >= 3) {
/*  77:    */                       break label852;
/*  78:    */                     }
/*  79: 93 */                     int i9 = i4;
/*  80: 94 */                     int i10 = i5;
/*  81: 95 */                     int i11 = i6;
/*  82: 96 */                     int i12 = 6;
/*  83:    */                     
/*  84: 98 */                     arq localarq = null;
/*  85: 99 */                     xq localxq = null;
/*  86:101 */                     for (int i13 = 0;; i13++)
/*  87:    */                     {
/*  88:101 */                       if (i13 >= 4) {
/*  89:    */                         break label846;
/*  90:    */                       }
/*  91:102 */                       i9 += paramqt.s.nextInt(i12) - paramqt.s.nextInt(i12);
/*  92:103 */                       i10 += paramqt.s.nextInt(1) - paramqt.s.nextInt(1);
/*  93:104 */                       i11 += paramqt.s.nextInt(i12) - paramqt.s.nextInt(i12);
/*  94:105 */                       dt localdt2 = new dt(i9, i10, i11);
/*  95:    */                       
/*  96:107 */                       float f1 = i9 + 0.5F;
/*  97:108 */                       float f2 = i11 + 0.5F;
/*  98:110 */                       if (!paramqt.b(f1, i10, f2, 24.0D)) {
/*  99:112 */                         if (((dt)localObject1).c(f1, i10, f2) >= 576.0D)
/* 100:    */                         {
/* 101:116 */                           if (localarq == null)
/* 102:    */                           {
/* 103:117 */                             localarq = paramqt.a(localxp, localdt2);
/* 104:118 */                             if (localarq == null) {
/* 105:    */                               break label846;
/* 106:    */                             }
/* 107:    */                           }
/* 108:122 */                           if (paramqt.a(localxp, localarq, localdt2)) {
/* 109:126 */                             if (a(xr.a(localarq.b), paramqt, localdt2))
/* 110:    */                             {
/* 111:    */                               xn localxn;
/* 112:    */                               try
/* 113:    */                               {
/* 114:129 */                                 localxn = (xn)localarq.b.getConstructor(new Class[] { aqu.class }).newInstance(new Object[] { paramqt });
/* 115:    */                               }
/* 116:    */                               catch (Exception localException)
/* 117:    */                               {
/* 118:131 */                                 localException.printStackTrace();
/* 119:132 */                                 return j;
/* 120:    */                               }
/* 121:135 */                               localxn.b(f1, i10, f2, paramqt.s.nextFloat() * 360.0F, 0.0F);
/* 122:137 */                               if ((localxn.bQ()) && (localxn.bR()))
/* 123:    */                               {
/* 124:138 */                                 localxq = localxn.a(paramqt.E(new dt(localxn)), localxq);
/* 125:140 */                                 if (localxn.bR())
/* 126:    */                                 {
/* 127:141 */                                   i7++;
/* 128:142 */                                   paramqt.d(localxn);
/* 129:    */                                 }
/* 130:144 */                                 if (i7 >= localxn.bU()) {
/* 131:    */                                   break;
/* 132:    */                                 }
/* 133:    */                               }
/* 134:148 */                               j += i7;
/* 135:    */                             }
/* 136:    */                           }
/* 137:    */                         }
/* 138:    */                       }
/* 139:    */                     }
/* 140:    */                   }
/* 141:    */                 }
/* 142:    */               }
/* 143:    */             }
/* 144:    */           }
/* 145:    */         }
/* 146:    */       }
/* 147:    */     }
/* 148:155 */     return j;
/* 149:    */   }
/* 150:    */   
/* 151:    */   protected static dt a(aqu paramaqu, int paramInt1, int paramInt2)
/* 152:    */   {
/* 153:159 */     bfh localbfh = paramaqu.a(paramInt1, paramInt2);
/* 154:160 */     int i = paramInt1 * 16 + paramaqu.s.nextInt(16);
/* 155:161 */     int j = paramInt2 * 16 + paramaqu.s.nextInt(16);
/* 156:162 */     int k = uv.c(localbfh.f(new dt(i, 0, j)) + 1, 16);
/* 157:163 */     int m = paramaqu.s.nextInt(k > 0 ? k : localbfh.g() + 16 - 1);
/* 158:    */     
/* 159:165 */     return new dt(i, m, j);
/* 160:    */   }
/* 161:    */   
/* 162:    */   public static boolean a(xo paramxo, aqu paramaqu, dt paramdt)
/* 163:    */   {
/* 164:169 */     if (paramaqu.af().a(paramdt))
/* 165:    */     {
/* 166:170 */       atr localatr1 = paramaqu.p(paramdt).c();
/* 167:172 */       if (paramxo == xo.c) {
/* 168:173 */         return (localatr1.r().d()) && (paramaqu.p(paramdt.b()).c().r().d()) && (!paramaqu.p(paramdt.a()).c().t());
/* 169:    */       }
/* 170:175 */       dt localdt = paramdt.b();
/* 171:176 */       if (!aqu.a(paramaqu, localdt)) {
/* 172:177 */         return false;
/* 173:    */       }
/* 174:179 */       atr localatr2 = paramaqu.p(localdt).c();
/* 175:180 */       int i = (localatr2 != aty.h) && (localatr2 != aty.cv) ? 1 : 0;
/* 176:181 */       return (i != 0) && (!localatr1.t()) && (!localatr1.r().d()) && (!paramaqu.p(paramdt.a()).c().t());
/* 177:    */     }
/* 178:185 */     return false;
/* 179:    */   }
/* 180:    */   
/* 181:    */   public static void a(aqu paramaqu, arm paramarm, int paramInt1, int paramInt2, int paramInt3, int paramInt4, Random paramRandom)
/* 182:    */   {
/* 183:189 */     List localList = paramarm.a(xp.b);
/* 184:190 */     if (localList.isEmpty()) {
/* 185:191 */       return;
/* 186:    */     }
/* 187:194 */     while (paramRandom.nextFloat() < paramarm.g())
/* 188:    */     {
/* 189:195 */       arq localarq = (arq)vj.a(paramaqu.s, localList);
/* 190:196 */       int i = localarq.c + paramRandom.nextInt(1 + localarq.d - localarq.c);
/* 191:197 */       xq localxq = null;
/* 192:    */       
/* 193:199 */       int j = paramInt1 + paramRandom.nextInt(paramInt3);
/* 194:200 */       int k = paramInt2 + paramRandom.nextInt(paramInt4);
/* 195:201 */       int m = j;
/* 196:202 */       int n = k;
/* 197:204 */       for (int i1 = 0; i1 < i; i1++)
/* 198:    */       {
/* 199:205 */         int i2 = 0;
/* 200:206 */         for (int i3 = 0; (i2 == 0) && (i3 < 4); i3++)
/* 201:    */         {
/* 202:208 */           dt localdt = paramaqu.r(new dt(j, 0, k));
/* 203:210 */           if (a(xo.a, paramaqu, localdt))
/* 204:    */           {
/* 205:    */             xn localxn;
/* 206:    */             try
/* 207:    */             {
/* 208:213 */               localxn = (xn)localarq.b.getConstructor(new Class[] { aqu.class }).newInstance(new Object[] { paramaqu });
/* 209:    */             }
/* 210:    */             catch (Exception localException)
/* 211:    */             {
/* 212:215 */               localException.printStackTrace();
/* 213:216 */               continue;
/* 214:    */             }
/* 215:219 */             localxn.b(j + 0.5F, localdt.o(), k + 0.5F, paramRandom.nextFloat() * 360.0F, 0.0F);
/* 216:    */             
/* 217:221 */             paramaqu.d(localxn);
/* 218:222 */             localxq = localxn.a(paramaqu.E(new dt(localxn)), localxq);
/* 219:223 */             i2 = 1;
/* 220:    */           }
/* 221:226 */           j += paramRandom.nextInt(5) - paramRandom.nextInt(5);
/* 222:227 */           k += paramRandom.nextInt(5) - paramRandom.nextInt(5);
/* 223:228 */           while ((j < paramInt1) || (j >= paramInt1 + paramInt3) || (k < paramInt2) || (k >= paramInt2 + paramInt3))
/* 224:    */           {
/* 225:229 */             j = m + paramRandom.nextInt(5) - paramRandom.nextInt(5);
/* 226:230 */             k = n + paramRandom.nextInt(5) - paramRandom.nextInt(5);
/* 227:    */           }
/* 228:    */         }
/* 229:    */       }
/* 230:    */     }
/* 231:    */   }
/* 232:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     arg
 * JD-Core Version:    0.7.0.1
 */