/*   1:    */ import com.google.common.base.Predicate;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class baj
/*   5:    */   extends atg
/*   6:    */ {
/*   7: 36 */   public static final beu a = beu.a("facing");
/*   8: 37 */   public static final bet b = bet.a("nodrop");
/*   9: 39 */   private static final Predicate M = new bak();
/*  10:    */   private bek N;
/*  11:    */   private bek O;
/*  12:    */   
/*  13:    */   protected baj()
/*  14:    */   {
/*  15: 50 */     super(bof.q);
/*  16: 51 */     j(this.L.b().a(a, ej.c).a(b, Boolean.valueOf(false)));
/*  17: 52 */     a(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
/*  18:    */   }
/*  19:    */   
/*  20:    */   public boolean c()
/*  21:    */   {
/*  22: 57 */     return false;
/*  23:    */   }
/*  24:    */   
/*  25:    */   public boolean d()
/*  26:    */   {
/*  27: 62 */     return false;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public void a(ard paramard, dt paramdt)
/*  31:    */   {
/*  32: 67 */     switch (bal.a[((ej)paramard.p(paramdt).b(a)).ordinal()])
/*  33:    */     {
/*  34:    */     case 1: 
/*  35:    */     default: 
/*  36: 70 */       a(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
/*  37: 71 */       break;
/*  38:    */     case 2: 
/*  39: 73 */       a(0.25F, 0.25F, 0.5F, 0.75F, 0.75F, 1.0F);
/*  40: 74 */       break;
/*  41:    */     case 3: 
/*  42: 76 */       a(0.25F, 0.25F, 0.0F, 0.75F, 0.75F, 0.5F);
/*  43: 77 */       break;
/*  44:    */     case 4: 
/*  45: 79 */       a(0.5F, 0.25F, 0.25F, 1.0F, 0.75F, 0.75F);
/*  46: 80 */       break;
/*  47:    */     case 5: 
/*  48: 82 */       a(0.0F, 0.25F, 0.25F, 0.5F, 0.75F, 0.75F);
/*  49:    */     }
/*  50:    */   }
/*  51:    */   
/*  52:    */   public brt a(aqu paramaqu, dt paramdt, bec parambec)
/*  53:    */   {
/*  54: 90 */     a(paramaqu, paramdt);
/*  55: 91 */     return super.a(paramaqu, paramdt, parambec);
/*  56:    */   }
/*  57:    */   
/*  58:    */   public bec a(aqu paramaqu, dt paramdt, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, xm paramxm)
/*  59:    */   {
/*  60: 96 */     return P().a(a, paramxm.aO()).a(b, Boolean.valueOf(false));
/*  61:    */   }
/*  62:    */   
/*  63:    */   public bcm a(aqu paramaqu, int paramInt)
/*  64:    */   {
/*  65:101 */     return new bdm();
/*  66:    */   }
/*  67:    */   
/*  68:    */   public alq b(aqu paramaqu, dt paramdt)
/*  69:    */   {
/*  70:106 */     return amk.bX;
/*  71:    */   }
/*  72:    */   
/*  73:    */   public int j(aqu paramaqu, dt paramdt)
/*  74:    */   {
/*  75:111 */     bcm localbcm = paramaqu.s(paramdt);
/*  76:112 */     if ((localbcm instanceof bdm)) {
/*  77:113 */       return ((bdm)localbcm).c();
/*  78:    */     }
/*  79:115 */     return super.j(paramaqu, paramdt);
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, float paramFloat, int paramInt) {}
/*  83:    */   
/*  84:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, ahd paramahd)
/*  85:    */   {
/*  86:126 */     if (paramahd.by.d)
/*  87:    */     {
/*  88:128 */       parambec = parambec.a(b, Boolean.valueOf(true));
/*  89:129 */       paramaqu.a(paramdt, parambec, 4);
/*  90:    */     }
/*  91:131 */     super.a(paramaqu, paramdt, parambec, paramahd);
/*  92:    */   }
/*  93:    */   
/*  94:    */   public void b(aqu paramaqu, dt paramdt, bec parambec)
/*  95:    */   {
/*  96:136 */     if (paramaqu.D) {
/*  97:137 */       return;
/*  98:    */     }
/*  99:140 */     if (!((Boolean)parambec.b(b)).booleanValue())
/* 100:    */     {
/* 101:141 */       bcm localbcm = paramaqu.s(paramdt);
/* 102:142 */       if ((localbcm instanceof bdm))
/* 103:    */       {
/* 104:143 */         bdm localbdm = (bdm)localbcm;
/* 105:144 */         amj localamj = new amj(amk.bX, 1, j(paramaqu, paramdt));
/* 106:146 */         if ((localbdm.c() == 3) && (localbdm.b() != null))
/* 107:    */         {
/* 108:147 */           localamj.d(new fn());
/* 109:    */           
/* 110:149 */           fn localfn = new fn();
/* 111:    */           
/* 112:151 */           ga.a(localfn, localbdm.b());
/* 113:152 */           localamj.o().a("SkullOwner", localfn);
/* 114:    */         }
/* 115:155 */         a(paramaqu, paramdt, localamj);
/* 116:    */       }
/* 117:    */     }
/* 118:158 */     super.b(paramaqu, paramdt, parambec);
/* 119:    */   }
/* 120:    */   
/* 121:    */   public alq a(bec parambec, Random paramRandom, int paramInt)
/* 122:    */   {
/* 123:164 */     return amk.bX;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public boolean b(aqu paramaqu, dt paramdt, amj paramamj)
/* 127:    */   {
/* 128:168 */     if ((paramamj.i() == 1) && (paramdt.o() >= 2) && (paramaqu.aa() != vt.a) && (!paramaqu.D)) {
/* 129:169 */       return j().a(paramaqu, paramdt) != null;
/* 130:    */     }
/* 131:172 */     return false;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public void a(aqu paramaqu, dt paramdt, bdm parambdm)
/* 135:    */   {
/* 136:176 */     if ((parambdm.c() != 1) || (paramdt.o() < 2) || (paramaqu.aa() == vt.a) || (paramaqu.D)) {
/* 137:177 */       return;
/* 138:    */     }
/* 139:180 */     bek localbek = l();
/* 140:181 */     bem localbem = localbek.a(paramaqu, paramdt);
/* 141:182 */     if (localbem == null) {
/* 142:183 */       return;
/* 143:    */     }
/* 144:186 */     for (int i = 0; i < 3; i++)
/* 145:    */     {
/* 146:187 */       bei localbei1 = localbem.a(i, 0, 0);
/* 147:188 */       paramaqu.a(localbei1.d(), localbei1.a().a(b, Boolean.valueOf(true)), 2);
/* 148:    */     }
/* 149:190 */     for (i = 0; i < localbek.c(); i++) {
/* 150:191 */       for (int j = 0; j < localbek.b(); j++)
/* 151:    */       {
/* 152:192 */         localObject = localbem.a(i, j, 0);
/* 153:193 */         paramaqu.a(((bei)localObject).d(), aty.a.P(), 2);
/* 154:    */       }
/* 155:    */     }
/* 156:197 */     dt localdt = localbem.a(1, 0, 0).d();
/* 157:    */     
/* 158:199 */     adf localadf = new adf(paramaqu);
/* 159:200 */     Object localObject = localbem.a(1, 2, 0).d();
/* 160:201 */     localadf.b(((dt)localObject).n() + 0.5D, ((dt)localObject).o() + 0.55D, ((dt)localObject).p() + 0.5D, localbem.b().k() == el.a ? 0.0F : 90.0F, 0.0F);
/* 161:202 */     localadf.aG = (localbem.b().k() == el.a ? 0.0F : 90.0F);
/* 162:203 */     localadf.n();
/* 163:205 */     for (ahd localahd : paramaqu.a(ahd.class, localadf.aQ().b(50.0D, 50.0D, 50.0D))) {
/* 164:206 */       localahd.b(tl.I);
/* 165:    */     }
/* 166:209 */     paramaqu.d(localadf);
/* 167:211 */     for (int k = 0; k < 120; k++) {
/* 168:212 */       paramaqu.a(ew.F, localdt.n() + paramaqu.s.nextDouble(), localdt.o() - 2 + paramaqu.s.nextDouble() * 3.9D, localdt.p() + paramaqu.s.nextDouble(), 0.0D, 0.0D, 0.0D, new int[0]);
/* 169:    */     }
/* 170:215 */     for (k = 0; k < localbek.c(); k++) {
/* 171:216 */       for (int m = 0; m < localbek.b(); m++)
/* 172:    */       {
/* 173:217 */         bei localbei2 = localbem.a(k, m, 0);
/* 174:218 */         paramaqu.b(localbei2.d(), aty.a);
/* 175:    */       }
/* 176:    */     }
/* 177:    */   }
/* 178:    */   
/* 179:    */   public bec a(int paramInt)
/* 180:    */   {
/* 181:225 */     return P().a(a, ej.a(paramInt & 0x7)).a(b, Boolean.valueOf((paramInt & 0x8) > 0));
/* 182:    */   }
/* 183:    */   
/* 184:    */   public int c(bec parambec)
/* 185:    */   {
/* 186:232 */     int i = 0;
/* 187:    */     
/* 188:234 */     i |= ((ej)parambec.b(a)).a();
/* 189:236 */     if (((Boolean)parambec.b(b)).booleanValue()) {
/* 190:237 */       i |= 0x8;
/* 191:    */     }
/* 192:240 */     return i;
/* 193:    */   }
/* 194:    */   
/* 195:    */   protected bed e()
/* 196:    */   {
/* 197:245 */     return new bed(this, new bex[] { a, b });
/* 198:    */   }
/* 199:    */   
/* 200:    */   protected bek j()
/* 201:    */   {
/* 202:249 */     if (this.N == null) {
/* 203:250 */       this.N = ben.a().a(new String[] { "   ", "###", "~#~" }).a('#', bei.a(beq.a(aty.aW))).a('~', bei.a(beq.a(aty.a))).b();
/* 204:    */     }
/* 205:261 */     return this.N;
/* 206:    */   }
/* 207:    */   
/* 208:    */   protected bek l()
/* 209:    */   {
/* 210:265 */     if (this.O == null) {
/* 211:266 */       this.O = ben.a().a(new String[] { "^^^", "###", "~#~" }).a('#', bei.a(beq.a(aty.aW))).a('^', M).a('~', bei.a(beq.a(aty.a))).b();
/* 212:    */     }
/* 213:278 */     return this.O;
/* 214:    */   }
/* 215:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     baj
 * JD-Core Version:    0.7.0.1
 */