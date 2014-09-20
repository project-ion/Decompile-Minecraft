/*   1:    */ public class ajn
/*   2:    */   extends alq
/*   3:    */ {
/*   4: 28 */   private static final int[] k = { 11, 16, 15, 13 };
/*   5: 33 */   public static final String[] a = { "minecraft:items/empty_armor_slot_helmet", "minecraft:items/empty_armor_slot_chestplate", "minecraft:items/empty_armor_slot_leggings", "minecraft:items/empty_armor_slot_boots" };
/*   6: 37 */   private static final eo l = new ajo();
/*   7:    */   public final int b;
/*   8:    */   public final int c;
/*   9:    */   public final int d;
/*  10:    */   private final ajp m;
/*  11:    */   
/*  12:    */   public ajn(ajp paramajp, int paramInt1, int paramInt2)
/*  13:    */   {
/*  14:123 */     this.m = paramajp;
/*  15:124 */     this.b = paramInt2;
/*  16:125 */     this.d = paramInt1;
/*  17:126 */     this.c = paramajp.b(paramInt2);
/*  18:127 */     d(paramajp.a(paramInt2));
/*  19:128 */     this.h = 1;
/*  20:129 */     a(akf.j);
/*  21:130 */     ave.M.a(this, l);
/*  22:    */   }
/*  23:    */   
/*  24:    */   public int a(amj paramamj, int paramInt)
/*  25:    */   {
/*  26:135 */     if (paramInt > 0) {
/*  27:136 */       return 16777215;
/*  28:    */     }
/*  29:139 */     int i = b(paramamj);
/*  30:140 */     if (i < 0) {
/*  31:141 */       i = 16777215;
/*  32:    */     }
/*  33:143 */     return i;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public int b()
/*  37:    */   {
/*  38:148 */     return this.m.a();
/*  39:    */   }
/*  40:    */   
/*  41:    */   public ajp w_()
/*  42:    */   {
/*  43:152 */     return this.m;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public boolean d_(amj paramamj)
/*  47:    */   {
/*  48:156 */     if (this.m != ajp.a) {
/*  49:157 */       return false;
/*  50:    */     }
/*  51:159 */     if (!paramamj.n()) {
/*  52:160 */       return false;
/*  53:    */     }
/*  54:162 */     if (!paramamj.o().b("display", 10)) {
/*  55:163 */       return false;
/*  56:    */     }
/*  57:165 */     if (!paramamj.o().m("display").b("color", 3)) {
/*  58:166 */       return false;
/*  59:    */     }
/*  60:169 */     return true;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public int b(amj paramamj)
/*  64:    */   {
/*  65:173 */     if (this.m != ajp.a) {
/*  66:174 */       return -1;
/*  67:    */     }
/*  68:177 */     fn localfn1 = paramamj.o();
/*  69:178 */     if (localfn1 != null)
/*  70:    */     {
/*  71:179 */       fn localfn2 = localfn1.m("display");
/*  72:180 */       if ((localfn2 != null) && 
/*  73:181 */         (localfn2.b("color", 3))) {
/*  74:182 */         return localfn2.f("color");
/*  75:    */       }
/*  76:    */     }
/*  77:186 */     return 10511680;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public void c(amj paramamj)
/*  81:    */   {
/*  82:190 */     if (this.m != ajp.a) {
/*  83:191 */       return;
/*  84:    */     }
/*  85:193 */     fn localfn1 = paramamj.o();
/*  86:194 */     if (localfn1 == null) {
/*  87:195 */       return;
/*  88:    */     }
/*  89:197 */     fn localfn2 = localfn1.m("display");
/*  90:198 */     if (localfn2.c("color")) {
/*  91:199 */       localfn2.o("color");
/*  92:    */     }
/*  93:    */   }
/*  94:    */   
/*  95:    */   public void b(amj paramamj, int paramInt)
/*  96:    */   {
/*  97:204 */     if (this.m != ajp.a) {
/*  98:205 */       throw new UnsupportedOperationException("Can't dye non-leather!");
/*  99:    */     }
/* 100:208 */     fn localfn1 = paramamj.o();
/* 101:210 */     if (localfn1 == null)
/* 102:    */     {
/* 103:211 */       localfn1 = new fn();
/* 104:212 */       paramamj.d(localfn1);
/* 105:    */     }
/* 106:215 */     fn localfn2 = localfn1.m("display");
/* 107:216 */     if (!localfn1.b("display", 10)) {
/* 108:217 */       localfn1.a("display", localfn2);
/* 109:    */     }
/* 110:219 */     localfn2.a("color", paramInt);
/* 111:    */   }
/* 112:    */   
/* 113:    */   public boolean a(amj paramamj1, amj paramamj2)
/* 114:    */   {
/* 115:224 */     if (this.m.b() == paramamj2.b()) {
/* 116:225 */       return true;
/* 117:    */     }
/* 118:227 */     return super.a(paramamj1, paramamj2);
/* 119:    */   }
/* 120:    */   
/* 121:    */   public amj a(amj paramamj, aqu paramaqu, ahd paramahd)
/* 122:    */   {
/* 123:232 */     int i = xn.c(paramamj) - 1;
/* 124:233 */     amj localamj = paramahd.q(i);
/* 125:235 */     if (localamj == null)
/* 126:    */     {
/* 127:236 */       paramahd.c(i, paramamj.k());
/* 128:237 */       paramamj.b = 0;
/* 129:    */     }
/* 130:240 */     return paramamj;
/* 131:    */   }
/* 132:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ajn
 * JD-Core Version:    0.7.0.1
 */