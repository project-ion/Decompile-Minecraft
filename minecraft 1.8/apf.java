/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import com.google.common.collect.Maps;
/*   3:    */ import java.util.ArrayList;
/*   4:    */ import java.util.List;
/*   5:    */ import java.util.Map;
/*   6:    */ 
/*   7:    */ public abstract class apf
/*   8:    */ {
/*   9: 19 */   private static final apf[] a = new apf[256];
/*  10:    */   public static final apf[] b;
/*  11: 21 */   private static final Map E = Maps.newHashMap();
/*  12: 29 */   public static final apf c = new apu(0, new oa("protection"), 10, 0);
/*  13: 30 */   public static final apf d = new apu(1, new oa("fire_protection"), 5, 1);
/*  14: 31 */   public static final apf e = new apu(2, new oa("feather_falling"), 5, 2);
/*  15: 32 */   public static final apf f = new apu(3, new oa("blast_protection"), 2, 3);
/*  16: 33 */   public static final apf g = new apu(4, new oa("projectile_protection"), 5, 4);
/*  17: 34 */   public static final apf h = new apt(5, new oa("respiration"), 2);
/*  18: 35 */   public static final apf i = new apy(6, new oa("aqua_affinity"), 2);
/*  19: 36 */   public static final apf j = new apv(7, new oa("thorns"), 1);
/*  20: 37 */   public static final apf k = new apx(8, new oa("depth_strider"), 2);
/*  21: 40 */   public static final apf l = new apc(16, new oa("sharpness"), 10, 0);
/*  22: 41 */   public static final apf m = new apc(17, new oa("smite"), 5, 1);
/*  23: 42 */   public static final apf n = new apc(18, new oa("bane_of_arthropods"), 5, 2);
/*  24: 43 */   public static final apf o = new apr(19, new oa("knockback"), 5);
/*  25: 44 */   public static final apf p = new app(20, new oa("fire_aspect"), 2);
/*  26: 45 */   public static final apf q = new aps(21, new oa("looting"), 2, apg.g);
/*  27: 48 */   public static final apf r = new ape(32, new oa("efficiency"), 10);
/*  28: 49 */   public static final apf s = new apw(33, new oa("silk_touch"), 1);
/*  29: 50 */   public static final apf t = new apd(34, new oa("unbreaking"), 5);
/*  30: 51 */   public static final apf u = new aps(35, new oa("fortune"), 2, apg.h);
/*  31: 54 */   public static final apf v = new aoy(48, new oa("power"), 10);
/*  32: 55 */   public static final apf w = new apb(49, new oa("punch"), 2);
/*  33: 56 */   public static final apf x = new aoz(50, new oa("flame"), 2);
/*  34: 57 */   public static final apf y = new apa(51, new oa("infinity"), 1);
/*  35: 60 */   public static final apf z = new aps(61, new oa("luck_of_the_sea"), 2, apg.i);
/*  36: 61 */   public static final apf A = new apq(62, new oa("lure"), 2, apg.i);
/*  37:    */   public final int B;
/*  38:    */   private final int F;
/*  39:    */   public apg C;
/*  40:    */   protected String D;
/*  41:    */   
/*  42:    */   static
/*  43:    */   {
/*  44: 70 */     ArrayList localArrayList = Lists.newArrayList();
/*  45: 72 */     for (apf localapf : a) {
/*  46: 73 */       if (localapf != null) {
/*  47: 74 */         localArrayList.add(localapf);
/*  48:    */       }
/*  49:    */     }
/*  50: 78 */     b = (apf[])localArrayList.toArray(new apf[localArrayList.size()]);
/*  51:    */   }
/*  52:    */   
/*  53:    */   public static apf c(int paramInt)
/*  54:    */   {
/*  55: 82 */     if ((paramInt < 0) || (paramInt >= a.length)) {
/*  56: 83 */       return null;
/*  57:    */     }
/*  58: 85 */     return a[paramInt];
/*  59:    */   }
/*  60:    */   
/*  61:    */   protected apf(int paramInt1, oa paramoa, int paramInt2, apg paramapg)
/*  62:    */   {
/*  63: 89 */     this.B = paramInt1;
/*  64: 90 */     this.F = paramInt2;
/*  65: 91 */     this.C = paramapg;
/*  66: 93 */     if (a[paramInt1] != null) {
/*  67: 94 */       throw new IllegalArgumentException("Duplicate enchantment id!");
/*  68:    */     }
/*  69: 96 */     a[paramInt1] = this;
/*  70: 97 */     E.put(paramoa, this);
/*  71:    */   }
/*  72:    */   
/*  73:    */   public static apf b(String paramString)
/*  74:    */   {
/*  75:106 */     return (apf)E.get(new oa(paramString));
/*  76:    */   }
/*  77:    */   
/*  78:    */   public static String[] c()
/*  79:    */   {
/*  80:110 */     String[] arrayOfString = new String[E.size()];
/*  81:111 */     int i1 = 0;
/*  82:112 */     for (oa localoa : E.keySet()) {
/*  83:113 */       arrayOfString[(i1++)] = localoa.toString();
/*  84:    */     }
/*  85:115 */     return arrayOfString;
/*  86:    */   }
/*  87:    */   
/*  88:    */   public int d()
/*  89:    */   {
/*  90:119 */     return this.F;
/*  91:    */   }
/*  92:    */   
/*  93:    */   public int e()
/*  94:    */   {
/*  95:123 */     return 1;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public int b()
/*  99:    */   {
/* 100:127 */     return 1;
/* 101:    */   }
/* 102:    */   
/* 103:    */   public int a(int paramInt)
/* 104:    */   {
/* 105:131 */     return 1 + paramInt * 10;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public int b(int paramInt)
/* 109:    */   {
/* 110:135 */     return a(paramInt) + 5;
/* 111:    */   }
/* 112:    */   
/* 113:    */   public int a(int paramInt, wh paramwh)
/* 114:    */   {
/* 115:139 */     return 0;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public float a(int paramInt, xs paramxs)
/* 119:    */   {
/* 120:143 */     return 0.0F;
/* 121:    */   }
/* 122:    */   
/* 123:    */   public boolean a(apf paramapf)
/* 124:    */   {
/* 125:147 */     return this != paramapf;
/* 126:    */   }
/* 127:    */   
/* 128:    */   public apf c(String paramString)
/* 129:    */   {
/* 130:152 */     this.D = paramString;
/* 131:153 */     return this;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public String a()
/* 135:    */   {
/* 136:158 */     return "enchantment." + this.D;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public String d(int paramInt)
/* 140:    */   {
/* 141:162 */     String str = fi.a(a());
/* 142:163 */     return str + " " + fi.a(new StringBuilder().append("enchantment.level.").append(paramInt).toString());
/* 143:    */   }
/* 144:    */   
/* 145:    */   public boolean a(amj paramamj)
/* 146:    */   {
/* 147:167 */     return this.C.a(paramamj.b());
/* 148:    */   }
/* 149:    */   
/* 150:    */   public void a(xm paramxm, wv paramwv, int paramInt) {}
/* 151:    */   
/* 152:    */   public void b(xm paramxm, wv paramwv, int paramInt) {}
/* 153:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     apf
 * JD-Core Version:    0.7.0.1
 */