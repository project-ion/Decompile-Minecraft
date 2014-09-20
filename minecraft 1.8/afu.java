/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ class afu
/*   4:    */   extends zy
/*   5:    */ {
/*   6:    */   private final aft a;
/*   7:    */   private ej b;
/*   8:    */   private boolean c;
/*   9:    */   
/*  10:    */   public afu(aft paramaft)
/*  11:    */   {
/*  12:194 */     super(paramaft, 1.0D, 10);
/*  13:195 */     this.a = paramaft;
/*  14:    */     
/*  15:197 */     a(1);
/*  16:    */   }
/*  17:    */   
/*  18:    */   public boolean a()
/*  19:    */   {
/*  20:202 */     if (this.a.u() != null) {
/*  21:203 */       return false;
/*  22:    */     }
/*  23:205 */     if (!this.a.s().m()) {
/*  24:206 */       return false;
/*  25:    */     }
/*  26:209 */     Random localRandom = this.a.bb();
/*  27:210 */     if (localRandom.nextInt(10) == 0)
/*  28:    */     {
/*  29:211 */       this.b = ej.a(localRandom);
/*  30:    */       
/*  31:213 */       dt localdt = new dt(this.a.s, this.a.t + 0.5D, this.a.u).a(this.b);
/*  32:214 */       bec localbec = this.a.o.p(localdt);
/*  33:215 */       if (axs.d(localbec))
/*  34:    */       {
/*  35:216 */         this.c = true;
/*  36:217 */         return true;
/*  37:    */       }
/*  38:    */     }
/*  39:221 */     this.c = false;
/*  40:222 */     return super.a();
/*  41:    */   }
/*  42:    */   
/*  43:    */   public boolean b()
/*  44:    */   {
/*  45:227 */     if (this.c) {
/*  46:228 */       return false;
/*  47:    */     }
/*  48:230 */     return super.b();
/*  49:    */   }
/*  50:    */   
/*  51:    */   public void c()
/*  52:    */   {
/*  53:235 */     if (!this.c)
/*  54:    */     {
/*  55:236 */       super.c();
/*  56:237 */       return;
/*  57:    */     }
/*  58:240 */     aqu localaqu = this.a.o;
/*  59:241 */     dt localdt = new dt(this.a.s, this.a.t + 0.5D, this.a.u).a(this.b);
/*  60:242 */     bec localbec = localaqu.p(localdt);
/*  61:244 */     if (axs.d(localbec))
/*  62:    */     {
/*  63:245 */       localaqu.a(localdt, aty.be.P().a(axs.a, axu.a(localbec)), 3);
/*  64:246 */       this.a.y();
/*  65:247 */       this.a.J();
/*  66:    */     }
/*  67:    */   }
/*  68:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     afu
 * JD-Core Version:    0.7.0.1
 */